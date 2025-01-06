package com.tutorial;

public class PegawaiTetap extends Pegawai{
    private double tunjangan;
    private int durasiLembur;

    // Constructor untuk PegawaiTetap
    public PegawaiTetap(String nama, double gajiPokok, double tunjangan, int durasiLembur) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
        this.durasiLembur = durasiLembur;
    }

    // Setter untuk tunjangan
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Setter untuk durasi lembur
    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
    }

    // Implementasi hitung gaji bersih untuk Pegawai Tetap
    public void hitungGajiBersih() {
        // Menghitung gaji bersih
        double lembur = durasiLembur * (0.1 * getGajiPokok());
        double gajiBersih = getGajiPokok() + tunjangan + lembur;

        super.setGajiBersih(gajiBersih);
    }

    // Menampilkan informasi pegawai tetap
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Durasi Lembur: " + durasiLembur + " jam");
        System.out.println("Gaji Bersih: " + getGajiBersih());
    }
}
