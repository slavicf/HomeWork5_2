package players;

public class Player {

    public String song = "The Best Song";
    public String[] playlist = new String[] {"The best song", "Good song", "Super Song"};

    public void playSong () {
        System.out.println("Playing: " + song);
    }

}
