package com.vlu.bokkit.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

public class RatingCommentAndStarNoValueAdvice {
    @ResponseBody
    @ExceptionHandler(RatingCommentAndStarNoValue.class)
    public Map<String,String> exceptionHandler(RatingCommentAndStarNoValue ratingCommentAndStarNoValue)
    {
        Map<String,String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", ratingCommentAndStarNoValue.getMessage());
        return errorMap;
    }
}
