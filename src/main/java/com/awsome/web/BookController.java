package com.awsome.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.awsome.domain.Book;
import com.awsome.service.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBookList() {
        return bookService.findAll();
    }
    @RequestMapping(value="/create", method = RequestMethod.POST)
    public void createBook(@ModelAttribute Book book) {
        bookService.insertBook(book);
    }
}
