package com.tutorial;

// this.nama itu akan mengakses atribut dalam class ini
// jika tidak ditemukan maka akses ke superclass
// super.nama akan mengakses atribut di superclass
public class HeroStrenght extends Hero {
    String nama = "Class HeroStrenght";

    // overriding
    void cetak(){
        System.out.println("Ini adalah " + super.nama);
        this.dummyMethode();
        super.dummyMethode();
    }

    // overriding methode dummy
    void dummyMethode(){
        System.out.println("ini methode subclass");
    }
}
