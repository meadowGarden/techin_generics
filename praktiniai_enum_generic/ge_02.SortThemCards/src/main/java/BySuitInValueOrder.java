import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    public BySuitInValueOrder(){

    }


    @Override
    public int compare(Card c1, Card c2) {
        return c1.compareTo(c2);
    }
}
