package com.tastebox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tastebox.entity.Book;
import com.tastebox.repository.BookDao;


@Service("BookService")
@Transactional
public class BookService {
	
	@Autowired
	private BookDao bookDao;
	
	public void saveBook(Book book)
	{
		bookDao.save(book);
	}
	
	public Book getBook(String id) {
		return bookDao.findById(id);
	}

}
