package com.example.springjokeprojectv2.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class FakeUser {
   private String userName;
   private String password;
   private String url;
}
