/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek09042026;
/**
 *
 * @author dhiii
 */
public class MahasiswaEnkapsulasi {

    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private double ipk = 0;

    public MahasiswaEnkapsulasi() {
    }

    public MahasiswaEnkapsulasi(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public MahasiswaEnkapsulasi(String nama, String nim, String jurusan, int umur, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.umur = umur;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void tampilData() {
        System.out.println("Nama Mahasiswa   : " + nama);
        System.out.println("NIM Mahasiswa    : " + nim);
        System.out.println("Jurusan          : " + jurusan);
        System.out.println("Umur             : " + umur);
        System.out.println("IPK              : " + ipk);
    }

    public String statusKelulusan() {
        if (ipk >= 2.75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}