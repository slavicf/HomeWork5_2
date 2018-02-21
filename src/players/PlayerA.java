package players;

public class PlayerA extends Player {   // Имеет метод public void playAllSongs() для некоторых плееров

    public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++){
            song = playlist[i];
            playSong();
        }
    }
}
