package com.bookapp;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.model.BookNotFoundException;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappBasicApplication.class, args);
	}
	@Autowired
	IBookService iBookService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String category = scanner.next();

      
        IBookService bookService = new BookServiceImpl();
      // List<Book>booksByCategory bookService.getByCategory("Breathe");
       
        try {

            List<Book>booksByCategory=bookService.getByCategory(category);
            for (Book book:booksByCategory){
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            System.out.println("book not found "+e.getMessage());
        }
        try {

            List<Book>booksByAuthor=bookService.getByCategory(category);
            for (Book book:booksByAuthor){
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            System.out.println("book not found "+e.getMessage());
        }
        
    try {

        List<Book>booksByPrice=bookService.getByCategory(category);
        for (Book book:booksByPrice){
            System.out.println(book);
        }
    }catch (BookNotFoundException e){
        System.out.println("book not found "+e.getMessage());
    }
    try {

        List<Book>booksById=bookService.getByCategory(category);
        for (Book book:booksById){
            System.out.println(book);
        }
    }catch (BookNotFoundException e){
        System.out.println("book not found "+e.getMessage());
    }
    }
	}
	
