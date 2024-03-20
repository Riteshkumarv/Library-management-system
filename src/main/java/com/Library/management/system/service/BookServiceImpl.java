package com.Library.management.system.service;

import com.Library.management.system.entites.Author;
import com.Library.management.system.entites.Book;
import com.Library.management.system.repository.AuthorRepository;
import com.Library.management.system.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    public String addBook(Book book) throws Exception {

        Author author;

        try {
            author = authorRepository.findById(book.getAuthor().getId()).get();
        }catch (Exception e){
            throw new Exception("author is not exist");
        }

        author.getBooks().add(book);
        book.setAuthor(author);

        authorRepository.save(author);

        return "addBook successfully";
    }

    public List<Book> findAllTheBooks(){
        return bookRepository.findAll();
    }
}
