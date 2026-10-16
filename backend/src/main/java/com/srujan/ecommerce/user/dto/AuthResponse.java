package com.srujan.ecommerce.user.dto;//this class belongs to dto package

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AuthResponse {

    private String accessToken;
    private String tokenType;
    private UserResponse user;
}