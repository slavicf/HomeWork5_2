package players;

public class Player {
//    Базовый класс
//    Имеет final цену(задается в конструкторе) и геттер
//    Имеет только 1 песню

    public final double PRICE;
    public String song = "The Best Song";

    public Player(double PRICE) {
        this.PRICE = PRICE;
    }

    public double getPrice() {
        return PRICE;
    }

    public void playSong () {
        System.out.println("Playing: " + song);
    }

}
