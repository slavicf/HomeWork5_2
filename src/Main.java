import players.Player;
import players.Player1;

public class Main {

    static void showPlaylist (Player player) {
        for (int i = 0; i < player.playlist.length; i++) {
            System.out.println("Song #" + (i + 1) + " - " + player.playlist[i]);
        }
    }

    public static void main(String[] args) {

//        Player player = new Player();
//        showPlaylist(player);
//        player.playSong();

        Player1 player1 = new Player1();
        System.out.println("Player price: " + player1.getPrice());
        showPlaylist(player1);
        player1.playSong();

    }

}
