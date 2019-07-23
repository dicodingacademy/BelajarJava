package com.dicoding.javafundamental.inputouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println("Program penjumlahan sangat sederhana");
        int value1 = 0;
        int value2 = 0;
        try {
            System.out.print("Masukan Angka pertama : ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan Angka kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah : " + hasil);
    }
}