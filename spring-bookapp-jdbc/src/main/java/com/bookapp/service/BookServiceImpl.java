package com.bookapp.service;



import java.util.ArrayList;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;


public class BookServiceImpl implements IBookService{

    List<Book> books;

    public BookServiceImpl(List<Book> books){
        this.books=books;
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> bookByAuthor = new ArrayList<>();
        for (Book book : bookByAuthor) {
            if (book.getAuthor().startsWith(author)) {

                bookByAuthor.add(book);
            }
        }
        if (bookByAuthor.isEmpty()) {
            throw new BookNotFoundException("no book found by this author");
        }
        return bookByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {

        List<Book> bookByCategory = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategory().equals(category)) {

            bookByCategory.add(book);
        }
    }
    if(bookByCategory.isEmpty()){
        throw new BookNotFoundException("no book found by this category");
    }
    return bookByCategory;
}
    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        Double priceValue = price;
        List<Book>bookByPrice = new ArrayList<>();
        for (Book book:books){
            if (book.getPrice()<priceValue){

                bookByPrice.add(book);
            }
        }
        if(bookByPrice.isEmpty()){
            throw new BookNotFoundException("no book at this price..");

        }
        return bookByPrice;
    }


    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        for(Book book:books){
            if(book.getBookId() == bookId){
            	 throw new IdNotFoundException("id not found");

            }
        }
		return null;
       
    }
}
