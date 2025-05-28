package com.bharath.learning.spring.core.beanscopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//No need to specify singleton scope explicitly as it is the default scope in Spring
@Scope("singleton") // This is the default scope, so it can be omitted
public class PrinterService {

    public void print(String message) {
        System.out.println("Printing message: " + message);
    }
}
