package com.srujan.ecommerce.common.exception;//this class belong to this package
//runtimeException is a java build-in class for errors that
//happen at run time not at compile time
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
//custom error for our ecommer application , creating your own exceptionn .
//java alredy have NullPointerException and ArithmaticException , here we are creating our own exception
