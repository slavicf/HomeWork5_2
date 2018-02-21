package players;

public class Player1 {
//    Имеет final цену(задается в конструкторе) и геттер
//    Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
//    playSong Может проиграть песню.

    public final double PRICE;
    public String song = "The Best Song";

    public Player1(double PRICE) {
        this.PRICE = PRICE;
    }

    public double getPrice() {
        return PRICE;
    }

    public void playSong () {
        System.out.println("Playing: " + song);
    }

}
