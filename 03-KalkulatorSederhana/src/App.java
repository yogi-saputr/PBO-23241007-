class Kalkulator{
    // atribut
    double Perkalian;
    double Penjumlahan;
    double Pengurangan;
    double Pembagian;

    // constructor dengan parameter
    Kalkulator (double Input1, double Input2){
        Perkalian = Input1 * Input2;
        Penjumlahan = Input1 + Input2;
        Pengurangan = Input1 - Input2;
        Pembagian = Input1 / Input2;
        
        // cetak
        System.out.println("Hasil Perkalian: " + Perkalian);
        System.out.println("Hasil Penjumlahan: " + Penjumlahan);
        System.out.println("Hasil Pengurangan: " + Pengurangan);
        System.out.println("Hasil Pembagian: " + Pembagian);
    }
}


public class App {
    public static void main(String[] args) throws Exception {

        // instansi object class kalkulator
        System.out.println("Kalkulator 1");
        Kalkulator Kalkulator1 = new Kalkulator(5, 2);
        System.out.println();
        System.out.println("Kalkulator 2");
        Kalkulator kalkulator2 = new Kalkulator(10, 5);
        
    }
}