package players;

public class Player2 extends Player1{
//    Имеет final цену(задается в конструкторе) и геттер
//    Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
//    playSong Пытаясь проиграть песню выдает ошибку в консоль - “error”.

    public Player2(double PRICE) {
        super(PRICE);
    }

    @Override
    public void playSong() {
        this.song = "error";
        super.playSong();
    }
}
