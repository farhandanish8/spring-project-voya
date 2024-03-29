package com.bookapp.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.data.repository.core.NamedQueries;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.util.Queries;
@Repository
public class BookRepositoryImpl implements IBookRepository {
	private JdbcTemplate jdbcTemplate;
	
	public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate=jdbcTemplate;
	}
	@Override
	public void addBook(Book book) {
		Object[] bookArr = {book.getTitle(),book.getAuthor(),book.getPrice(),book.getCategory()};
		jdbcTemplate.update(Queries.INSERTQUERY,bookArr);
	}
	@Override
	public void updateBook(int bookId,double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY,price,bookId);
		
	}
	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY,bookId);
	}
	@Override
	public Book findById(int bookId){
		BookMapper bookMapper=new BookMapper();
		Book book = jdbcTemplate.queryForObject(Queries.SELECTQUERY,bookMapper);
		return book;
	}
	@Override
	public List<Book> findAll(){
		org.springframework.jdbc.core.RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries.SELECTQUERY,mapper);
		return books;
	
	}
	
	@Override
	public List<Book> findByAuthor(String author){
		return jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY,(rs, rowNum)->(
				Book book = new Book();
				book.setAuthor(rs.getString("author"));
				book.setBookId(rs.getInt("book_id"));
				book.setTitle(rs.getString("title"));
				book.setCategory(rs.getString("category"));
				book.setPrice(rs.getDouble("price"));
				return book;
			},author);
}
@Override
public List<Book> findByLesserPrice(double price) throws BookNotFoundException{
	List<Book> books = jdbcTemplate.query(Queries.SELECTBYPRICEQUERY,new BookMapper(),price);
	return books;
}

public List<Book> findByAuthorCategory(String author, String Category)throws BookNotFoundException{
	List<Book> books = jdbcTemplate.query(Queries.SELECTBYPRICEQUERY,new BookMapper(),author,Category);
	return books;

}
@Override
public List<Book> getAll() {
	// TODO Auto-generated method stub
	return null;
}
}