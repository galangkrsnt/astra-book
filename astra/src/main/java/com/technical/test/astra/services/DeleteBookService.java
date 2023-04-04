package com.technical.test.astra.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.technical.test.astra.repositories.BookRepository;

@Service
public class DeleteBookService {

    @Autowired
    BookRepository bookRepository;
    
    public ResponseEntity<?> deleteBook(String idBuku) {
        
        bookRepository.deleteById(idBuku);;

        return ResponseEntity.ok("Book data "+idBuku+" deleted");
    }
}
