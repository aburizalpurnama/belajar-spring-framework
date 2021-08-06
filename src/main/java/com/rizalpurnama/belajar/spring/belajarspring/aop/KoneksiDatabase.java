package com.rizalpurnama.belajar.spring.belajarspring.aop;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class KoneksiDatabase {
    private String url;
    private String username;
    private String password;

    public void connect(){
        System.out.println("Connected to database..");
        System.out.println("Database url : " + url);
        System.out.println("Database username : " + username);
        System.out.println("Database password : " + password);
    }

    public void disconnect(){
        System.out.println("Disconnected from database..");
    }
}
