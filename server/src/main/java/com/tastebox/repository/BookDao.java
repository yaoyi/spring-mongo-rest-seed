package com.tastebox.repository;

import org.springframework.stereotype.Repository;

import com.tastebox.entity.Book;


@Repository
public class BookDao extends MongodbBaseDao<Book>{

	@Override
	protected Class<Book> getEntityClass() {
		return Book.class;
	}
}
