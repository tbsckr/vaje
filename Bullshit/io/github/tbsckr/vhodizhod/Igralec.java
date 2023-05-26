package io.github.tbsckr.vhodizhod;

public class Igralec {
    private int mesto;
    private String imePriimek;
    private String drzava;
    private int tocke;

    public Igralec(int mesto, String imePriimek, String drzava, String Tocke) {
        this.mesto = mesto;
        this.imePriimek = imePriimek;
        this.drzava = drzava;
        this.tocke = tocke;
    }

    public int getMesto() {
        return mesto;
    }

    public String getImePriimek() {
        return imePriimek;
    }

    public String getDrzava() {
        return drzava;
    }

    public int getTocke() {
        return tocke;
    }
}