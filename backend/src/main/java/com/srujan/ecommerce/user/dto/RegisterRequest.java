package com.srujan.ecommerce.user.dto;//Data Transfer Object
//Springboot controller recive the registration request from thr user ,springboot need the object to receive this info

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {

    @NotBlank(message = "Full name is required")//this require thr string to contain at least one non-white space character
    @Size(min = 2, max = 100, message = "Full name must be 2-100 characters")//value size should be in a range
    private String fullName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 100, message = "Password must be 8-100 characters")//password must contain atleast 8 letter and max 100
    private String password;

    private String phone;
}