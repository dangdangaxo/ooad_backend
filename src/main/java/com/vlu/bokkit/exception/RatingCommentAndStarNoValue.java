package com.vlu.bokkit.exception;

public class RatingCommentAndStarNoValue extends RuntimeException{
    public RatingCommentAndStarNoValue()
    {
        super("Cannot leave blank comment and star");
    }
}
