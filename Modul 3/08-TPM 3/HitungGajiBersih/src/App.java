class HitungGajiBersih {
    // Atribut
    private int gaji_pokok;
    private int tunjangan;
    private double pajak;

    // Konstruktor
    public HitungGajiBersih(int gaji_pokok, int tunjangan, double pajak) {
        this.gaji_pokok = 5000000;
        this.tunjangan = 2000000;
        this.pajak = 10.0;

    }

    // Setter dan Getter untuk gaji pokok
    public void setGajiPokok(int gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public int getGajiPokok() {
        return gaji_pokok;
    }

    // Setter dan Getter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    // Setter dan Getter untuk pajak
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    public double getPajak() {
        return (10.0 / 100) * (gaji_pokok + tunjangan); // contoh pajak 10%
    }

    // Method untuk menghitung gaji bersih
    public double cetakGajiBersih() {
        return (gaji_pokok + tunjangan) - getPajak();
    }
}

public class App {
    public static void main(String[] args) {
        // Instansi objek HitungGajiBersih
        HitungGajiBersih gaji = new HitungGajiBersih(5000000, 2000000, 10.0);

        // Menampilkan gaji bersih
        System.out.println("Gaji Bersih: Rp. " + gaji.cetakGajiBersih());

        // Getter(baca) saja
        double angka = gaji.getPajak();
    }
}