package players;

public class Player4 extends PlayerA {

    public Player4(double PRICE) {
        super(PRICE);
    }

    @Override
    public void playSong() {
        song = playlist[playlist.length - 1];
        super.playSong();
    }
}
