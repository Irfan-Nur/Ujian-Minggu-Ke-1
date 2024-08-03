package com.juaracoding.irfanujianjf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama film: ");
        String namaFilm = input.nextLine();
        System.out.print("Nama film dalam huruf besar: " + namaFilm.toUpperCase());
    }
}
