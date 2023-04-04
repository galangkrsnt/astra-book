package com.technical.test.astra.models.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UpdateBookRequestData {
    
    @JsonProperty("idBuku")
    private String idBuku;

    @JsonProperty("judul")
    private String judul;

    @JsonProperty("pengarang")
    private String pengarang;

    @JsonProperty("penerbit")
    private String penerbit;

    @JsonProperty("tanggalTerbit")
    private String tanggalTerbit;

    @JsonProperty("tebalBuku")
    private String tebalBuku;
}
