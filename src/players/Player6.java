package players;

import java.util.Random;

public class Player6 extends Player3 {
//    Имеет final цену(задается в конструкторе) и геттер
//    Имеет плейлист
//    playSong Может проиграть первую песню
//    playAllSongs может проиграть все песни
//    Имеет метод public void shuffle() - перемешивает все песни в плейлисте местами

    private Random rnd = new Random(); //  declarations

    public Player6(double PRICE) {
        super(PRICE);
    }

    public void shuffle() {
        for (int i = this.playlist.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            String a = this.playlist[index];
            this.playlist[index] = this.playlist[i];
            this.playlist[i] = a;
        }
    }
}
