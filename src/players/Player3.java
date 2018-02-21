package players;

public class Player3 extends PlayerA{
//    Имеет final цену(задается в конструкторе) и геттер
//    Имеет плейлист
//    playSong Может проиграть первую песню
//    playAllSongs может проиграть все песни

    public Player3(double PRICE) {
        super(PRICE);
    }

    @Override
    public void playSong() {
        song = playlist[0];
        super.playSong();
    }

}
