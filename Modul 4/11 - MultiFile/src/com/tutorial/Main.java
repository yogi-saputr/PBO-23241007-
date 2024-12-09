package com.tutorial;

// keyword import untuk panggil package eksternal

import com.terminal.Console;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Saitama");
        Player player2 = new Player("Ishigami Senku");
        Player player3 = new Player("Hinata Shoyo");

        player1.show();
        player2.show();
        player3.show();

        Console.log("Hallo");
    }
}
