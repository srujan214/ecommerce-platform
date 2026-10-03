package com.srujan.ecommerce.common.exception;//this class belong to this package
//issue http 409 conflict  : things you're trying to create alredy exist
//forntend be :  if (respose.status ===409)
//                   showerror("this email is alredy taken."
public class DuplicateResourceException extends RuntimeException {

    public DuplicateResourceException(String message) {
        super(message);
    }
}