package com.bharath.learning.spring.core.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class HelloWorld {

    public void sayHello() {
        System.out.println("Hello World");
    }

}

@Configuration
class Config {


    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}

class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.sayHello();

    }
}