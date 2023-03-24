package com.MyCode.fullstack.backend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("could not found the user with id "+ id);
    }
}
