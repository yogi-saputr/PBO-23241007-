package com.terminal;

// visibilitasnya bisa diakses oleh package eksternal/berbeda
public class Console {
    public static void log(String pesan){
        System.out.println(pesan);
    }
}

// hanya bisa diakses dari package com.terminal saja
class Terminal{
    public static void log(String pesan){
        System.out.println(pesan);
    }
}