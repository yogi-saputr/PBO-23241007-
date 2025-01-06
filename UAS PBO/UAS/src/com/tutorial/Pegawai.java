package com.tutorial;

public class Pegawai {
// Superclass Pegawai
    private String nama;
    private double gajiPokok;
    private double gajiBersih;  

    // Constructor untuk Pegawai
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.gajiBersih = 0;
    }

    public double getGajiBersih() {
        return this.gajiBersih;
    }

    protected void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }
    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void hitungGajiBersih() {
    }

    // Menampilkan informasi pegawai
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
