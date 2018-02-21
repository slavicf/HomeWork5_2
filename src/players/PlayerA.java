package players;

public class PlayerA extends Player {

    public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++){
            song = playlist[i];
            playSong();
        }
    }
}
