package com.micrsoervices.hotelservice.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource not found in server");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
