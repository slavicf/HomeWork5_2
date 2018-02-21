package players;

public class PlayerA extends Player {
//    Имеет плейлист
//    playAllSongs может проиграть все песни

    public String[] playlist = new String[] {"The best song", "Good song", "Super Song"};

    public PlayerA(double PRICE) {
        super(PRICE);
    }

    public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++){
            song = playlist[i];
            super.playSong();
        }
    }

}
