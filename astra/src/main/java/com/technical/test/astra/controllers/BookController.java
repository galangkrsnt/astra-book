package com.technical.test.astra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technical.test.astra.models.requests.AddBookRequestData;
import com.technical.test.astra.models.requests.GetBookByStatusRequestData;
import com.technical.test.astra.models.requests.UpdateBookRequestData;
import com.technical.test.astra.models.requests.UpdateStatusRequestData;
import com.technical.test.astra.services.AddBookService;
import com.technical.test.astra.services.DeleteBookService;
import com.technical.test.astra.services.GetBookService;
import com.technical.test.astra.services.UpdateBookService;

@RestController
@RequestMapping(value = "/astra/book")
public class BookController {

    protected GetBookService getBookService;
    protected AddBookService addBookService;
    protected UpdateBookService updateBookService;
    protected DeleteBookService deleteBookService;



    @Autowired
    public BookController(GetBookService getBookService, AddBookService addBookService, UpdateBookService updateBookService, DeleteBookService deleteBookService) {
        this.getBookService = getBookService;
        this.addBookService = addBookService;
        this.updateBookService = updateBookService;
        this.deleteBookService = deleteBookService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllBooks() throws InterruptedException {
        return getBookService.getAllBooks();
    }

    @GetMapping("/get-by-status")
    public ResponseEntity<?> getBookByStatus(@RequestBody GetBookByStatusRequestData getBookByStatusRequestData) throws InterruptedException {
        return getBookService.getBookByStatus(getBookByStatusRequestData);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addBook(@RequestBody AddBookRequestData addBookRequestData) throws InterruptedException {
        return addBookService.addBook(addBookRequestData);
    }

    @PutMapping("/update-book")
    public ResponseEntity<?> updateBook(@RequestBody UpdateBookRequestData updateBookRequestData) throws InterruptedException {
        return updateBookService.updateBook(updateBookRequestData);
    }

    @PutMapping("/update-status")
    public ResponseEntity<?> updateStatus(@RequestBody UpdateStatusRequestData updateStatusRequestData) throws InterruptedException {
        return updateBookService.updateStatus(updateStatusRequestData);
    }

    @DeleteMapping("/delete/{idBuku}")
    public ResponseEntity<?> deleteBook(@PathVariable String idBuku) throws InterruptedException {
        return deleteBookService.deleteBook(idBuku);
    }
    
}
