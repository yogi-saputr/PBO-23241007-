package com.tutorial;

public class PegawaiNonTetap extends Pegawai{
    int durasiLembur;

    // Constructor untuk PegawaiTidakTetap
    public PegawaiNonTetap(String nama, double gajiPokok, int durasiLembur) {
        super(nama, gajiPokok);
        this.durasiLembur = durasiLembur;
    }

    // Setter untuk durasi lembur
    public void setDurasiLembur(int durasiLembur) {
        this.durasiLembur = durasiLembur;
    }

    public void hitungGajiBersih() {
        // Menghitung gaji bersih
        double lembur = durasiLembur * (0.5 * getGajiPokok());
        double gajiBersih = getGajiPokok() + lembur;

        super.setGajiBersih(gajiBersih);
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Durasi Lembur: " + durasiLembur + " jam");
        System.out.println("Gaji Bersih: " + getGajiBersih());
    }
}
