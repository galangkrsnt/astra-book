package com.technical.test.astra.models.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UpdateStatusRequestData {

    @JsonProperty("idBuku")
    private String idBuku;
    
    @JsonProperty("peminjam")
    private String peminjam;

    @JsonProperty("tanggalPinjam")
    private String tanggalPinjam;

    @JsonProperty("tanggalKembali")
    private String tanggalKembali;
}
