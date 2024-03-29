package com.bookapp.repository;

import java.util.List;

import com.bookapp.model.Book;

public interface IBookRepository {
	
	public void addBook(Book book);
	public void updateBook(int bookId,double price);
	public void deleteBook(int bookId);
	public Book findById(int bookId);
	
	
	public List<Book> findAll();
	public List<Book> findByAuthor(String author);
	public List<Book> findByLesserPrice(double price);
	public List<Book> getAll();
}
