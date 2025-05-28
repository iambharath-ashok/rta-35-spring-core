package com.bharath.learning.spring.core.beanscopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype") // This scope indicates that a new instance will be created each time it is requested
public class InvoiceGenerator {

    private final List<Item> items;

    public InvoiceGenerator() {
        this.items = new ArrayList<>();
    }

    public File generateInvoice() {
        // Logic to generate invoice
        System.out.println("Generating invoice for items: " + items);
        // For simplicity, returning a dummy file object
        return new File("invoice.txt");
    }
}

record Item(String name, double price) {
    // Record class to represent an item in the invoice
}
