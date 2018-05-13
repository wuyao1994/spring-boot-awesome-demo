package com.awsome.service;

import com.awsome.domain.Book;

import java.util.List;

public interface BookService {
	List<Book> findAll();



	Book insertBook(Book book);
}
