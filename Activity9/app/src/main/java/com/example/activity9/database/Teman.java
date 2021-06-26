package com.example.activity9.database;

import java.io.Serializable;

public class Teman implements Serializable {
    String id;
    String nama;
    String telpon;
    String kode;

    public Teman(String nm, String tlp) {
    }

    public Teman(String id, String nama, String telpon) {
        this.id = id;
        this.nama = nama;
        this.telpon = telpon;
    }

    public String getId() { return id; }

    public void setId(String id) {this.id = id; }

    public String getNama() { return nama; }

    public void setNama(String id) {this.nama = id; }

    public String getTelpon() { return telpon; }

    public void setTelpon(String id) {this.telpon = id; }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public String toString() {
        return "Teman{" +
                "nama='" + nama + '\'' +
                ", telpon='" + telpon + '\'' +
                '}';
    }
}

