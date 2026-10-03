package com.srujan.ecommerce.common.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
//resourcenotfoundException 404 error : i look for x ,it doesn't exist
//DuplicateResouceException  409 error : you tried to create x but it alredy exist
//businessException           400 error : your request is valid but vialates the buniness rules