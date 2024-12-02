package com.tutorial;

import com.terminal.Console;

// visibility default
// hanya bisa diakses oleh package yang sama

class Player {
    private String nama;

    Player (String nama){
        this.nama = nama;
    }

    void cetak(){
        // System.out.println("Player nama : " + this.nama);

        Console.log("Menggunakan console");
        Console.log("Player Nana : " + this.nama);
    }
}
