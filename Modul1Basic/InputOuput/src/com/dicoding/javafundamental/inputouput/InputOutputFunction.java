package com.dicoding.javafundamental.inputouput;

import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumalahan sangat sederhana");
        System.out.print("Masukan Angka pertama : ");
        int value1 = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int value2 = scanner.nextInt();
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah : " + hasil);
    }
}
