package com.technical.test.astra.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.technical.test.astra.models.entities.Book;

import lombok.Data;

@Data
public class ResponseData {

    @JsonProperty("responseMessage")
    private String responseMessage;
    
    private Book data;

}
