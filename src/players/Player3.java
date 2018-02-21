package players;

public class Player3 extends Player{
//    Имеет final цену(задается в конструкторе) и геттер
//    Имеет плейлист
//    playSong Может проиграть первую песню
//    playAllSongs может проиграть все песни

    public String[] playlist = new String[] {"The best song", "Good song", "Super Song"};

    public Player3(double PRICE) {
        super(PRICE);
    }

    public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++){
            song = playlist[i];
            playSong();
        }
    }

}
