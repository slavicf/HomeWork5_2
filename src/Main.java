import players.*;

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

        Player5 player5 = new Player5(17.0);
        System.out.println("\nPlayer5, price: " + player5.getPrice());
        player5.playSong();
        player5.playAllSongs();

        Player6 player6 = new Player6(25.0);
        System.out.println("\nPlayer6, price: " + player6.getPrice());
        player6.playSong();
        player6.playAllSongs();
        player6.shuffle();
        player6.playAllSongs();

    }

}
