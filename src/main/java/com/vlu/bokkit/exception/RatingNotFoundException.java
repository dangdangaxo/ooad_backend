package com.vlu.bokkit.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


public class RatingNotFoundException extends RuntimeException{
    public RatingNotFoundException(Long id)
    {
        super("Could not found rating with id");
    }
}
