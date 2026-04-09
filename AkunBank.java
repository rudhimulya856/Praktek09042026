/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek09042026;
/**
 *
 * @author dhiii
 */
public class AkunBank {

    private String noRekening;
    private String namaNasabah;
    private double saldo;

    public AkunBank(String noRekening, String namaNasabah) {
        this.noRekening = noRekening;
        this.namaNasabah = namaNasabah;
        saldo = 1000000; // saldo awal
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double jumlah) {
        saldo = saldo + jumlah;
        System.out.println("Deposit berhasil");
        System.out.println("Saldo sekarang : Rp " + saldo);
    }

    public void withdraw(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup");
        } else {
            saldo = saldo - jumlah;
            System.out.println("Withdraw berhasil");
            System.out.println("Sisa saldo : Rp " + saldo);
        }
    }
}