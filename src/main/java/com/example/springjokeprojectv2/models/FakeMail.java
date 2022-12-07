package com.example.springjokeprojectv2.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class FakeMail {
    private String mail;
    private String password;
}
