package players;

public class Player1 extends Player {
//    Имеет final цену(задается в конструкторе) и геттер
//    Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
//    playSong Может проиграть песню.

    private final double price = 10.0;

    public double getPrice() {
        return price;
    }

    public Player1() {
        playlist = new String[] {playlist[0]};
    }

}
