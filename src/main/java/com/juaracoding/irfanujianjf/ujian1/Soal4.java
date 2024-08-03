package com.juaracoding.irfanujianjf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        String[] namaFilm = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar film bioskop");
        for (int i = 0; i < 5; i++) {
            System.out.print("Maukkan nama film ke " + (i+1) +": ");
            namaFilm[i] = input.nextLine();

        }
        System.out.println("Film yang ingin ditonton: ");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + namaFilm[i]);

        }
        }
    }

