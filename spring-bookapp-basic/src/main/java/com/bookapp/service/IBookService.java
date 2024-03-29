package com.bookapp.service;

import com.bookapp.model.Book;
import com.bookapp.model.BookNotFoundException;
import com.bookapp.model.IdNotFoundException;

import java.util.List;

public interface IBookService {
    List<Book>getAll();
    List<Book> getByAuthorStartsWith(String author)throws BookNotFoundException;
    List<Book> getByCategory(String category)throws BookNotFoundException;
    List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
//    List<Book>getByAuthorContainsAndCategory(String author, String category)throws BookNotFoundException;
    Book getById(int bookId)throws IdNotFoundException;
}
