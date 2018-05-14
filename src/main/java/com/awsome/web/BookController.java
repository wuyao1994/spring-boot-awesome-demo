package com.awsome.web;

import com.awsome.domain.Book;
import com.awsome.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    BookService bookService;



    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBookList() {
        return bookService.findAll();
    }



    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createBook(@RequestBody Book book) {
        bookService.insertBook(book);
    }



    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book findBookById(@PathVariable("id") Long id) {
        return bookService.findById(id);
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public Boolean deleteBook(@PathVariable("id") Long id) {
        return bookService.deleteBook(id);
    }



    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }
}
