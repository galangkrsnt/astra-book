package com.technical.test.astra.models.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GetBookByStatusRequestData {
    
    @JsonProperty("status")
    private String status;
}
