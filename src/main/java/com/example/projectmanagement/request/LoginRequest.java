package com.example.projectmanagement.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private  String password;


    public String getEmail() { // This method needs to exist
        return this.email;
    }
    public String getPassword() { // This method needs to exist
        return this.password;
    }

}
