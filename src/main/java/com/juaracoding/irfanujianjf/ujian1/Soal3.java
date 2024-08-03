package com.juaracoding.irfanujianjf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Tiket: ");
        int jumlahTiket = input.nextInt();
        System.out.println("Jumlah Tiket: "+ jumlahTiket);
        float diskon = 0.0f;
        boolean weekday = false;
        boolean weekend = true;

        if (jumlahTiket > 5) {
            if(weekday){
                int hargaWeekday = 35000 * jumlahTiket;
                diskon = 0.1f;
                System.out.println("Total harga (dengan diskon): "+hargaWeekday);
            } else if (weekend) {
                int hargaWeekend = 45000 * jumlahTiket;
                diskon = 0.1f;
                System.out.println("Total harga (dengan diskon): "+hargaWeekend);

            }
        } else {
            System.out.println("Maaf pembelian tiket belum lebih dari 5 tiket. Belum mendapat diskon");
        }


    }
}
