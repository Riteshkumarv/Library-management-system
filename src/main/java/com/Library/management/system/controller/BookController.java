package com.Library.management.system.controller;

import com.Library.management.system.entites.Book;
import com.Library.management.system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) throws Exception{
        return bookService.addBook(book);
    }

    @GetMapping("/findAllTheBooks")
    public List<Book> findAllTheBooks(){
        return bookService.findAllTheBooks();
    }

}
