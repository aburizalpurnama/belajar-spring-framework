package com.rizalpurnama.belajar.spring.belajarspring.jdbc;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Nasabah {
    private String nomor;
    private String name;
    private String email;

    public Nasabah(String nomor, String name, String email) {
        this.nomor = nomor;
        this.name = name;
        this.email = email;
    }

    public Nasabah() {
    }
}
