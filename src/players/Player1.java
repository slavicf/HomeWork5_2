package players;

public class Player1 extends Player {

    private final double price = 10.0;

    public double getPrice() {
        return price;
    }

    public Player1() {
        playlist = new String[] {playlist[0]};
    }
}
