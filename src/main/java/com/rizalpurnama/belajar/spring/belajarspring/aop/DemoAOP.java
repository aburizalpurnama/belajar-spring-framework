package com.rizalpurnama.belajar.spring.belajarspring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAOP {
    public static void main(String[] args) {

        ApplicationContext springContainer =
                new ClassPathXmlApplicationContext("config/config-aop.xml");

        DAO objectDao = springContainer.getBean(DAO.class);
        objectDao.simpan();

    }
}
