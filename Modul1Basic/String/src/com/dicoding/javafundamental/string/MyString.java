package com.dicoding.javafundamental.string;

public class MyString {
    public static void main(String[] args) {
        char[] dicodingChar = { 'd', 'i', 'c', 'o', 'd', 'i', 'n', 'g' };
        String dicodingString = new String(dicodingChar);
        System.out.println(dicodingString);

        String dicoding = "dicoding";
        int length = dicoding.length();
        System.out.println(length);

        char result = dicoding.charAt(7);
        System.out.println(result);
    }
}
