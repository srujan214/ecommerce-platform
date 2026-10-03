package com.srujan.ecommerce.common.response;//this class belongs to this packages
//goal : box that backend uses to send data to frotend
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> { //T means the data can be any type like <product > <user> <string> or any
//these are the things inside the box
    private boolean success;
    private String message;
    private T data;
//like sucess = true
//message =product found
//data = id :1
//       name :laptop
//       price :50000
    public static <T> ApiResponse<T> success(String message, T data) {
        return new ApiResponse<>(true, message, data);
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(true, "Success", data);
    }

    public static <T> ApiResponse<T> error(String message) {
        return new ApiResponse<>(false, message, null);
    }
}
