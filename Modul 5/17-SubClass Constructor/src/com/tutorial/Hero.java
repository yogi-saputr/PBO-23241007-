package com.tutorial;

public class Hero {
    // Atribut
    String nama;
    double defancePower;
    double attackPower;

    // constructor
    Hero(String nama, double defancePower, double attackPower){
        this.nama = nama;
        this.defancePower = defancePower;
        this.attackPower = attackPower;
    }

    // methode
    void cetak(){
        System.out.println("\nNama : " + this.nama);
        System.out.println("Defance Power : " + this.defancePower);
        System.out.println("Attack Power : " + this.attackPower);
    }
}
