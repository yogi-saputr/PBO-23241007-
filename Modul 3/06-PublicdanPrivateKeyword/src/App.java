class Data{
    // Data member atau variabel instant
    String nama; // default, bisa diakses diluar class
    public String prodi; // PUblic, bisa diakses diluar class
    private double ipk; // Private, hanya bisa diakses oleh class itu sendiri


    // konstruktor
    Data String nama, String prodi, double ipk{
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    // default modifier access methode 
    void cetakData(){
        tambahIPK(); // contoh aksess private method
        system.out.println("Nama : " + this.nama);
        system.out.println("Prodi : " + this.prodi);
        system.out.println("IPK : " + this.ipk);
    }

    // Publick modifier access method
    public void ubahNama(String namaBaru){
        this.nama = namaBaru;
    }

    // Private modifier access method
    private void tambahIPK(){
        this.ipk += 0.5;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objek
        Data data1 = Data("yogi", "PTI", "3.14");

        //Modifier default
        system.out.println(data1.nama);
        data1.nama = "Maulana";
        system.out.println(data1.nama);
        
        // Modifier acces publis
        system.out.println(data1.prodi);
        data1.nama = "Sipil";
        system.out.println(data1.prodi);
        
        // Modifiert access private
        // system.out.println(data1.ipk);
        // data1.nama = "Sipil";
        // system.out.println(data1.ipk);
        
        // Methode default
        data1.cetakData();
        
        // method publick
        data1.ubahNama("Ihsan");
        data1.cetakData();

        // method private
        //data1.tambahIPK();
    }
}
