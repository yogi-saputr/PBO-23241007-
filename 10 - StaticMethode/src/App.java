class player{

    private String nama;
    private static int numberOfplayer;

    // konstruktor
    Player(String nama){
        this.nama = nama;
        Player.numberOfplayer++;
    }

    // mrthode static
    static void showNumberOfPlayer(){
        System.out.println("NUmber of player " + Player.numberOfplayer);
    }

    // Methode menampilkan nama player
    void show(){
        System.out.println("Player nama : " + this.nama);
    }
}



public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Ronaldo");
        Player player2 = new Player("Pogba");
        Player player3 = new Player("Meguire");
        Player player4 = new Player("Rahmat");

        Player.showNumberOfPlayer();
    }
}
