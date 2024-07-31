package com.nisa.a09_app_catatan;

public class Catatan {

    private String nama;
    private String timestamp;

    public Catatan(String nama, String timestamp) {
        this.nama = nama;
        this.timestamp = timestamp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}