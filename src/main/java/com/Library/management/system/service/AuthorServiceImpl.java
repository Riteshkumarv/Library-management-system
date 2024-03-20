package com.Library.management.system.service;

import com.Library.management.system.entites.Author;
import com.Library.management.system.entites.Book;
import com.Library.management.system.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorRepository authorRepository;

    public String addAuthor(Author author){
        authorRepository.save(author);
        return "author add successfully";
    }

    public List<Book> getAllBooksByAuthorId(int id){
        Author author = authorRepository.findAuthorById(id);
        return author.getBooks();
    }

}
