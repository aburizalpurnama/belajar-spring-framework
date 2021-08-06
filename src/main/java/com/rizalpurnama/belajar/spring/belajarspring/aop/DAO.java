package com.rizalpurnama.belajar.spring.belajarspring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("dao")
public class DAO {

    @Autowired
    private KoneksiDatabase koneksiDatabase;

    public void simpan(){
        koneksiDatabase.connect();
        System.out.println("Menjakankan method simpan() pada class DAO...");
        koneksiDatabase.disconnect();
    }
}
