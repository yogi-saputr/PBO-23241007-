import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("=== Menu Kalkulator Sederhana ===");
            System.out.println("1. Perkalian");
            System.out.println("2. Penjumlahan");
            System.out.println("3. Pengurangan");
            System.out.println("4. Pembagian");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = input.nextInt();

            System.out.print("Masukkan bilangan pertama: ");
            double bilangan1 = input.nextDouble();

            System.out.print("Masukkan bilangan kedua: ");
            double bilangan2 = input.nextDouble();

            double hasil = 0;

            if (pilihan == 1) {
                hasil = bilangan1 * bilangan2;
                System.out.println("Hasil perkalian: " + hasil);
            } else if (pilihan == 2) {
                hasil = bilangan1 + bilangan2;
                System.out.println("Hasil penjumlahan: " + hasil);
            } else if (pilihan == 3) {
                hasil = bilangan1 - bilangan2;
                System.out.println("Hasil pengurangan: " + hasil);
            } else if (pilihan == 4) {
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                    System.out.println("Hasil pembagian: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Apakah anda ingin mengulang lagi? (Ya/Tidak): ");
            ulangi = input.next();
        } while (ulangi.equalsIgnoreCase("Ya"));

        System.out.println("Terima kasih telah menggunakan kalkulator.");
        input.close();
    }
}