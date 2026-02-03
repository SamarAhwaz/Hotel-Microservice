package com.example.HotelService.HotelService.GlobalException;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

//@RestControllerAdvice
public class ExceptionHandler {


    @org.springframework.web.bind.annotation.ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<ApiError> handleUserNotFound(
            HotelNotFoundException ex,
            HttpServletRequest request
    ) {
        ApiError error = ApiError.builder()
                .timeStamp(LocalDateTime.now())
                .error(true)
                .message(ex.getMessage())
                .errorcode(HttpStatus.NOT_FOUND.value())
                .build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
