package com.micrsoervices.hotelservice.exception;

import com.micrsoervices.hotelservice.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> resourseNotFoundExceptionHandler(ResourceNotFoundException exception){
        ApiResponse apiResponse = ApiResponse.builder().message(exception.getMessage()).status(true).httpStatus(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
    }
}
