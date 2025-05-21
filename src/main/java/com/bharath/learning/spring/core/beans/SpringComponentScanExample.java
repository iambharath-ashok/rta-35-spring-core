package com.bharath.learning.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class Person {

    public void sayHello() {
        System.out.println("Hello from Person");
    }
}

@Component
class Dog {

    public void bark() {
        System.out.println("Woof Woof");
    }
}

@Component
class Lion {

    public void roar() {
        System.out.println("Roar Roar");
    }
}

@Configuration
@ComponentScan("com.bharath.learning")
class ComponentScanConfig {

}


public class SpringComponentScanExample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        Person person = context.getBean(Person.class);
        person.sayHello();
        Dog dog = context.getBean(Dog.class);
        dog.bark();
        Lion lion = context.getBean(Lion.class);
        lion.roar();
    }
}
