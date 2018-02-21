import players.Player1;
import players.Player2;
import players.Player3;
import players.Player4;

public class Main {

    public static void main(String[] args) {

        Player1 player1 = new Player1(10.0);
        System.out.println("\nPlayer1, price: " + player1.getPrice());
        player1.playSong();

        Player2 player2 = new Player2(5.0);
        System.out.println("\nPlayer2, price: " + player2.getPrice());
        player2.playSong();

        Player3 player3 = new Player3(15.0);
        System.out.println("\nPlayer3, price: " + player3.getPrice());
        player3.playSong();
        player3.playAllSongs();

        Player4 player4 = new Player4(16.0);
        System.out.println("\nPlayer4, price: " + player4.getPrice());
        player4.playSong();
        player4.playAllSongs();

    }

}
