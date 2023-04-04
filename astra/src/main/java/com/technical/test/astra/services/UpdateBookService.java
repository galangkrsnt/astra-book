package com.technical.test.astra.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.technical.test.astra.models.entities.Book;
import com.technical.test.astra.models.requests.UpdateBookRequestData;
import com.technical.test.astra.models.requests.UpdateStatusRequestData;
import com.technical.test.astra.models.responses.ResponseData;
import com.technical.test.astra.repositories.BookRepository;

@Service
public class UpdateBookService {

    @Autowired
    BookRepository bookRepository;

    
    public ResponseEntity<?> updateBook(UpdateBookRequestData updateBookRequestData) {
        ResponseData response = new ResponseData();
        Book book = bookRepository.findOneById(updateBookRequestData.getIdBuku());
        if(book.equals(null)){
            return ResponseEntity.notFound().build();
        }
        book.setJudul(updateBookRequestData.getJudul());
        book.setPengarang(updateBookRequestData.getPengarang());
        book.setPenerbit(updateBookRequestData.getPenerbit());
        book.setTglTerbit(updateBookRequestData.getTanggalTerbit());
        book.setTebalBuku(updateBookRequestData.getTebalBuku());
        bookRepository.save(book);

        response.setResponseMessage("Update Data Book "+updateBookRequestData.getIdBuku()+" Success");
        response.setData(book);


        return ResponseEntity.ok(response);
    }


    public ResponseEntity<?> updateStatus(UpdateStatusRequestData updateStatusRequestData) {
        ResponseData response = new ResponseData();
        Book book = bookRepository.findOneById(updateStatusRequestData.getIdBuku());
        if(book.equals(null)){
            return ResponseEntity.notFound().build();
        }
        book.setStatus("1");
        book.setPeminjam(updateStatusRequestData.getPeminjam());
        book.setTglPinjam(updateStatusRequestData.getTanggalPinjam());
        book.setTglKembali(updateStatusRequestData.getTanggalKembali());
        bookRepository.save(book);

        response.setResponseMessage("Update Data Book "+updateStatusRequestData.getIdBuku()+" Success");
        response.setData(book);


        return ResponseEntity.ok(response);
    }
}
