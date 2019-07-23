package com.dicoding.javafundamental.kelas;

public class KucingAnggora {

    String nama_kucing;
    int berat_badan;

    //ini adalah contoh no-argument constructor
    public KucingAnggora() {

    }

    //ini adalah contoh parameterized constructor
    //dengan memberikan nilai awal data member nama_kucing dan berat_badan
    //dengan parameter yang kita tentukan
    public KucingAnggora(String nama, int berat) {
        nama_kucing = nama;
        berat_badan = berat;
    }
}