package com.github.grupo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = context.getBean(UserService.class);
        userService.registerUser("agustin");
    }
}