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

public class MainAkunBank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        AkunBank pp1 = new AkunBank("25010801", "Rudhi Mulya Putra");

        System.out.println("=== DATA AWAL ===");
        System.out.println("No Rekening : " + pp1.getNoRekening());
        System.out.println("Nama        : " + pp1.getNamaNasabah());
        System.out.println("Saldo       : Rp " + pp1.getSaldo());

        System.out.print("\nMasukkan jumlah deposit = ");
        double deposit = input.nextDouble();
        pp1.deposit(deposit);

        System.out.print("\nMasukkan jumlah withdraw = ");
        double withdraw = input.nextDouble();
        pp1.withdraw(withdraw);

        System.out.println("\n=== DATA SETELAH TRANSAKSI ===");
        System.out.println("Saldo akhir : Rp " + pp1.getSaldo());

        System.out.println("\n=== OBJEK 2 ===");

        System.out.print("Masukkan deposit = ");
        double deposit2 = input.nextDouble();

        System.out.print("Masukkan withdraw = ");
        double withdraw2 = input.nextDouble();

        AkunBank pp2 = new AkunBank("2501083003", "Rudhi Mulya Putra");

        pp2.deposit(deposit2);
        pp2.withdraw(withdraw2);

        System.out.println("Saldo akhir : Rp " + pp2.getSaldo());

    }
}