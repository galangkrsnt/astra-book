package com.technical.test.astra.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.technical.test.astra.models.entities.Book;
import com.technical.test.astra.models.requests.GetBookByStatusRequestData;
import com.technical.test.astra.repositories.BookRepository;


@Service
public class GetBookService {

    @Autowired
    BookRepository bookRepository;

    public ResponseEntity<?> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        if(books.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(books);
    }

    public ResponseEntity<?> getBookByStatus(GetBookByStatusRequestData getBookByStatusRequestData) {
        System.out.println(getBookByStatusRequestData.getStatus());
        List<Book> book = bookRepository.findByStatus(getBookByStatusRequestData.getStatus());
        if(book.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(book);
    }
}