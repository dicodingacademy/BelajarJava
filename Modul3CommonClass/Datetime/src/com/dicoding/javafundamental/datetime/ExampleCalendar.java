package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args) {

        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
    }
}