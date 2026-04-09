/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek09042026;
/**
 *
 * @author dhiii
 */
import java.util.Scanner;

public class MainPersegiPanjangEnkapsulasi {

    public static void main(String[] args) {

        System.out.println("Banyak objek : " + PersegiPanjangEnkapsulasi.getJumlahObjek());

        // Objek 1
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(10);
        pp1.setLebar(7);

        System.out.println("\nObjek 1 Menggunakan constructor 1");
        System.out.println("Luas Persegi Panjang      : " + pp1.getLuas());
        System.out.println("Keliling Persegi Panjang  : " + pp1.getKeliling());
        System.out.println("Banyak objek              : " + PersegiPanjangEnkapsulasi.getJumlahObjek());

        // Objek 2
        System.out.println("\nObjek 2 Menggunakan constructor 2");
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(19, 10);

        System.out.println("Luas Persegi Panjang      : " + pp2.getLuas());
        System.out.println("Keliling Persegi Panjang  : " + pp2.getKeliling());
        System.out.println("Banyak objek              : " + PersegiPanjangEnkapsulasi.getJumlahObjek());

        // Objek 3 (input user)
        System.out.println("\nObjek 3 Menggunakan constructor 2");
        System.out.println("Panjang dan Lebar di-input user");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang = ");
        int panjang = input.nextInt();

        System.out.print("Masukkan Lebar = ");
        int lebar = input.nextInt();

        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(panjang, lebar);

        System.out.println("Luas Persegi Panjang      : " + pp3.getLuas());
        System.out.println("Keliling Persegi Panjang  : " + pp3.getKeliling());
        System.out.println("Banyak objek              : " + PersegiPanjangEnkapsulasi.getJumlahObjek());

    }
}