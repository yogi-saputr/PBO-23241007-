package com.tutorial;

public class HeroStrenght extends Hero {
    String attribute = " Strenght";

    // constructor
    HeroStrenght(String nama, double defance, double attack){
        super(nama, defance, attack);

    }

    // overriding cetak
    void cetak(){
        System.out.println("Hero : " + this.attribute);
        super.cetak();
    }
}
