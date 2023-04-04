package com.technical.test.astra.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technical.test.astra.models.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,String> {
    List<Book> findByStatus(String status);
    Book findOneById(String idBook);
}
