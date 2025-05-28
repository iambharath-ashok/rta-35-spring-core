package com.bharath.learning.spring.core.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanScopesConfiguration.class);
       PrinterService printerService = applicationContext.getBean(PrinterService.class);
       PrinterService printerService2 = applicationContext.getBean(PrinterService.class);
       PrinterService printerService3 = applicationContext.getBean(PrinterService.class);
       PrinterService printerService4 = applicationContext.getBean(PrinterService.class);


        System.out.println("Are PrinterService beans the same? " + (printerService == printerService2));
        System.out.println("Are PrinterService beans the same? " + (printerService4 == printerService2));
        System.out.println("Are PrinterService beans the same? " + (printerService4 == printerService3));


        InvoiceGenerator invoiceGenerator = applicationContext.getBean(InvoiceGenerator.class);
        InvoiceGenerator invoiceGenerator2 = applicationContext.getBean(InvoiceGenerator.class);
        InvoiceGenerator invoiceGenerator3 = applicationContext.getBean(InvoiceGenerator.class);
        InvoiceGenerator invoiceGenerator4 = applicationContext.getBean(InvoiceGenerator.class);

        System.out.println("Are InvoiceGenerator beans the same? " + (invoiceGenerator == invoiceGenerator2));
        System.out.println("Are InvoiceGenerator beans the same? " + (invoiceGenerator4 == invoiceGenerator2));
        System.out.println("Are InvoiceGenerator beans the same? " + (invoiceGenerator4 == invoiceGenerator3));

    }
}
