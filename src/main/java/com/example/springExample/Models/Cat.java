package com.example.springExample.Models;

import java.awt.*;

public class Cat {
    private int old;
    private CatColor color;
    private String name;


    public Cat(int old, CatColor color, String name) {
        this.old = old;
        this.color = color;
        this.name = name;
    }


    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public CatColor getColor() {
        return color;
    }

    public void setColor(CatColor color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
