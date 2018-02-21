import players.Player1;
import players.Player2;
import players.Player3;

public class Main {

    public static void main(String[] args) {

        Player1 player1 = new Player1(10.0);
        System.out.println("\nPlayer1");
        System.out.println("price: " + player1.getPrice());
        player1.playSong();

        Player2 player2 = new Player2(5.0);
        System.out.println("\nPlayer2");
        System.out.println("price: " + player2.getPrice());
        player2.playSong();

        Player3 player3 = new Player3(15.0);
        System.out.println("\nPlayer3");
        System.out.println("Price: " + player3.getPrice());
        player3.playSong();
        player3.playAllSongs();

    }

}
