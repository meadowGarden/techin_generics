import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    public List<Card> getHand() {
        return hand;
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        hand.stream()
                .forEach(System.out::println);
    }

    public void sort() {
        hand.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public void sortBySuit() {

        Comparator<Card> newComparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);

        hand.stream()
                .sorted(newComparator)
                .forEach(System.out::println);
    }

    @Override
    public int compareTo(Hand o) {
        int thisHandValue = hand.stream()
                            .map(a -> a.getValue())
                            .reduce(0, (a,b) -> a + b);

        int otherHandValue = o.getHand().stream()
                            .map(a -> a.getValue())
                            .reduce(0, (a,b) -> a + b);

        return Integer.compare(thisHandValue, otherHandValue);
    }


}
