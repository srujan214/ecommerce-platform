package com.srujan.ecommerce.user.domain;


//imports allow you to use classes and annotations from other packages
import com.srujan.ecommerce.common.BaseEntity;//
import jakarta.persistence.*;//jakarta import gives you access to annotations such as @entity @table @column @enumerated @id @generatedValue
import lombok.Getter;//normally java requires getters and setters for access the private fields
import lombok.Setter;

@Getter
@Setter
@Entity//it tells JPA -treat this class as an entity that can be stored in database
@Table(name = "users")
public class User extends BaseEntity {//this java concepts called inheritance : inheritance allow you to reuse one
    //fields and methods from another class

    @Column(nullable = false, length = 100)//this field store the user fullName ,where name cannot be null ,and the lenth is 100
    private String fullName;//variable type is string because name contain texts

    @Column(nullable = false, unique = true, length = 150)//email cannot be null and should be unique and length is 150
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 20)//like its aoptional ,where we using the String because here we storing it not calculating or manipulating so we use string
    private String phone;

    @Enumerated(EnumType.STRING)//tells JPA to store the enums name as a string
    //Enum is a java type taht repressent the fixed set of possible values
    @Column(nullable = false, length = 20)//here we dinifining the possible roles which enum allows like customer and admin
    private Role role = Role.CUSTOMER;//you dont have to set the role everytime you created the user object

    @Column(nullable = false)//it show weather account is enabled
    private boolean enabled = true;//boolean which can have 2 values true or false
}