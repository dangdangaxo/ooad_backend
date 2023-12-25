package com.vlu.bokkit.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

public class RatingNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(RatingNotFoundException.class)
    public Map<String,String> exceptionHandler(RatingNotFoundException ratingNotFoundException)
    {
        Map<String,String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", ratingNotFoundException.getMessage());
        return errorMap;
    }
}
