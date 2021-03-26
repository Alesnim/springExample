package com.example.springExample.Models;

public class CatColor {

    private String nameColor;
    private int R;
    private int G;
    private int B;

    public CatColor(String nameColor, int r, int g, int b) {
        this.nameColor = nameColor;
        R = r;
        G = g;
        B = b;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }
}
