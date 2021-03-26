package com.example.springExample.Responces;

import com.example.springExample.Models.Cat;

public class CatResponse {
    private final String status;
    private final Integer code;
    private Cat cat;


    public CatResponse(String status, Integer code, Cat cat) {
        this.status = status;
        this.code = code;
        this.cat = cat;
    }


    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
