package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryApp {

    public static void main(String[] args) {

        // Load context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get bean
        BookService bookService = context.getBean("bookService", BookService.class);

        // Test it
        bookService.addBook();
    }
}
