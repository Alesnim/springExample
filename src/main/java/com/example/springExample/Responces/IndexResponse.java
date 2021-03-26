package com.example.springExample.Responces;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

public class IndexResponse {
    private final String status;
    private final Integer code;

    public IndexResponse(String status, Integer code) {
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }
}
