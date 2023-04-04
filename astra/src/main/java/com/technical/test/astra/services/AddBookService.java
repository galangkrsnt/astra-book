package com.technical.test.astra.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.technical.test.astra.models.entities.Book;
import com.technical.test.astra.models.requests.AddBookRequestData;
import com.technical.test.astra.models.responses.ResponseData;
import com.technical.test.astra.repositories.BookRepository;

@Service
public class AddBookService {

    @Autowired
    BookRepository bookRepository;

    public ResponseEntity<?> addBook(AddBookRequestData addBookRequestData) {
        Book book = new Book();
        ResponseData response = new ResponseData();
        book.setId(addBookRequestData.getIdBuku());
        book.setJudul(addBookRequestData.getJudul());
        book.setPengarang(addBookRequestData.getPengarang());
        book.setPenerbit(addBookRequestData.getPenerbit());
        book.setTglTerbit(addBookRequestData.getTanggalTerbit());
        book.setTebalBuku(addBookRequestData.getTebalBuku());
        book.setStatus("0");
        bookRepository.save(book);


        response.setResponseMessage("Add Book Data Success");
        response.setData(book);

        return ResponseEntity.ok(response);
    }
}
