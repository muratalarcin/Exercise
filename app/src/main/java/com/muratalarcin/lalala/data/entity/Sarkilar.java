package com.muratalarcin.lalala.data.entity;

import java.io.Serializable;

public class Sarkilar implements Serializable {
    private int id;
    private String ad;
    private String resim;
    private String tur;
    private int dinlenme;
    private float puan;

    public Sarkilar() {
    }

    public Sarkilar(int id, String ad, String resim, String tur, int dinlenme, float puan) {
        this.id = id;
        this.ad = ad;
        this.resim = resim;
        this.tur = tur;
        this.dinlenme = dinlenme;
        this.puan = puan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getDinlenme() {
        return dinlenme;
    }

    public void setDinlenme(int dinlenme) {
        this.dinlenme = dinlenme;
    }

    public float getPuan() {
        return puan;
    }

    public void setPuan(float puan) {
        this.puan = puan;
    }
}
