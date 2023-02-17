package com.micrsoervices.hotelservice.payload;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ApiResponse {

    private String message;

    private boolean status;

    private HttpStatus httpStatus;
}
