package com.juaracoding.irfanujianjf.ujian1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Data Film: ");
        int dataLength = input.nextInt();
        int[] price = new int[dataLength];
        int total = 0;
        for (int i = 0; i < price.length; i++) {
            System.out.println("Masukkan Harga tiket film ke -" + (i + 1) + ": ");
            price[i] = input.nextInt();
            total += price[i];

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Harga tiket film "+(i + 1) + ": " + price[i]);

        }
        System.out.println("Total harga tiket: " + total);
    }
}
