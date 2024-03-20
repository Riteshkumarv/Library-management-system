package com.Library.management.system.controller;

import com.Library.management.system.entites.Author;
import com.Library.management.system.entites.Book;
import com.Library.management.system.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @GetMapping("/getAllBooksByAuthorId/{id}")
    public List<Book> getAllBooksByAuthorId(@PathVariable int id){
        return authorService.getAllBooksByAuthorId(id);
    }
}
