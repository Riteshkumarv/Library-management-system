package com.Library.management.system.repository;

import com.Library.management.system.entites.Author;
import com.Library.management.system.entites.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
    Author findAuthorById(int id);
}
