package com.Library.management.system.service;

import com.Library.management.system.entites.Book;

import java.util.List;

public interface BookService {
    String addBook(Book book) throws Exception;

    List<Book> findAllTheBooks();
}
