package com.example.demo.exceptionhandler;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.Exception.DepartmentNotFoundException;
import com.example.demo.constants.DepartmentConstants;
import com.example.demo.model.CommonResponse;
import com.example.demo.model.ErrorResponse;

@ControllerAdvice
public class DepartmentExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, HttpServletRequest request) {
		String errorCode = DepartmentConstants.FILED_VALIDATION_FAIL_CODE.getStringValue();
		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).toList();
		String errormsg = errors.stream().collect(Collectors.joining(", "));
		ErrorResponse error = new ErrorResponse(errorCode, errormsg);
		CommonResponse response = new CommonResponse(error, null, HttpStatus.BAD_REQUEST.value(), request.getRequestURI());
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DepartmentNotFoundException.class)
	public ResponseEntity<Object> handleInvalidApplicationIdException(DepartmentNotFoundException ex, HttpServletRequest request) {
		String errorCode = DepartmentConstants.INVALID_DEPT_ID.getStringValue();
		String description = ex.getMessage();
		ErrorResponse error = new ErrorResponse(errorCode, description);
		CommonResponse response = new CommonResponse(error, null, HttpStatus.BAD_REQUEST.value(), request.getRequestURI());
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

}
