package players;

public class Player5 extends Player3 {
//    Имеет final цену(задается в конструкторе) и геттер
//    Имеет плейлист
//    playSong Может проиграть первую песню
//    playAllSongs может проиграть все песни с конца плейлиста в начало

    public Player5(double PRICE) {
        super(PRICE);
    }

    @Override
    public void playAllSongs() {
        for (int i = this.playlist.length - 1; i >= 0; i--){
            this.song = this.playlist[i];
            super.playSong();
        }
    }
}
