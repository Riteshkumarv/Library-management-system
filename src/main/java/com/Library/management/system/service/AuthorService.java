package com.Library.management.system.service;

import com.Library.management.system.entites.Author;
import com.Library.management.system.entites.Book;

import java.util.List;

public interface AuthorService {
    String addAuthor(Author author);

    List<Book> getAllBooksByAuthorId(int id);
}
