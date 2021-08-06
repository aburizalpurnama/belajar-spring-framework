package com.rizalpurnama.belajar.spring.belajarspring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoNasabah {
    public static void main(String[] args) {

        //Membuat object dari class nasabah DAO
        ApplicationContext springContainer = new ClassPathXmlApplicationContext("config/config-jdbc.xml");

        // Data yang mau diinsert
        Nasabah n = new Nasabah();
        n.setName("Aslan");
        n.setEmail("aslan@gmail.com");

        NasabahDao nd = springContainer.getBean(NasabahDao.class);
        nd.insert(n);
    }
}
