package com.technical.test.astra.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(schema = "astra" ,name="book")
public class Book {
    @Id
    @Column(name ="id")
    private String id;

    @Column(name ="judul")
    private String judul;

    @Column(name ="pengarang")
    private String pengarang;

    @Column(name ="penerbit")
    private String penerbit;

    @Column(name ="tgl_terbit")
    private String tglTerbit;

    @Column(name ="tebal_buku")
    private String tebalBuku;

    @Column(name ="status")
    private String status;

    @Column(name ="peminjam")
    private String peminjam;

    @Column(name ="tgl_pinjam")
    private String tglPinjam;

    @Column(name ="tgl_kembali")
    private String tglKembali;
}
