package players;

public class Player4 extends Player3 {
//    Имеет final цену(задается в конструкторе) и геттер
//    Имеет плейлист
//    playSong Может проиграть последнюю песню
//    playAllSongs может проиграть все песни

    public Player4(double PRICE) {
        super(PRICE);
        this.song = this.playlist[this.playlist.length - 1];
    }

}
