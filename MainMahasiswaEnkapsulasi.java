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

public class MainMahasiswaEnkapsulasi {

    public static void main(String[] args) {

        MahasiswaEnkapsulasi mhs1 = new MahasiswaEnkapsulasi();
        mhs1.setNama("Rudhi Mulya Putra");
        mhs1.setNim("2501083003");
        mhs1.setJurusan("Teknologi Informasi");
        mhs1.setUmur(19);
        mhs1.setIpk(3.8);

        mhs1.tampilData();
        System.out.println("Status Kelulusan : " + mhs1.statusKelulusan());

        MahasiswaEnkapsulasi mhs2 = new MahasiswaEnkapsulasi(
                "Adam Nopember", "2501082999", "Informatika", 20, 3.2
        );

        System.out.println("\nData Mahasiswa 2");
        mhs2.tampilData();
        System.out.println("Status Kelulusan : " + mhs2.statusKelulusan());

        Scanner input = new Scanner(System.in);

        System.out.print("\nNama   : ");
        String nama = input.nextLine();

        System.out.print("NIM    : ");
        String nim = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        System.out.print("Umur   : ");
        int umur = input.nextInt();

        System.out.print("IPK    : ");
        double ipk = input.nextDouble();

        MahasiswaEnkapsulasi mhs3 = new MahasiswaEnkapsulasi(nama, nim, jurusan, umur, ipk);

        System.out.println("\nData Mahasiswa 3");
        mhs3.tampilData();
        System.out.println("Status Kelulusan : " + mhs3.statusKelulusan());
    }
}