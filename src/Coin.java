import java.util.Random;

public class Coin {

    public final static int HEADS = 0;
    public final static int TAILS = 1;

    private int faceUp;

    public Coin() {
        flip();
    }

    public void flip() {
        Random rand = new Random();
        faceUp = rand.nextInt(2);
    }

    public String getFaceUp() {
        if(faceUp == HEADS) {
            return "Heads";
        } else if (faceUp == TAILS) {
            return "Tails";
        } else {
            return "Invalid";
        }
    }
}
