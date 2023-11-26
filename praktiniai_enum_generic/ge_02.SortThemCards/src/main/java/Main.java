

public class Main {

    public static void main(String[] args) {
        // test your code here

//        Card first = new Card(2, Suit.DIAMOND);
//        Card second = new Card(14, Suit.SPADE);
//        Card third = new Card(12, Suit.HEART);
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//
//        Card test01 = new Card(10, Suit.HEART);
//        Card test02 = new Card(10, Suit.SPADE);
//        System.out.println(test01.compareTo(test02));
//
//        System.out.println("-------");

        Hand hand = new Hand();
        hand.add( new Card(14,Suit.SPADE) );
        hand.add( new Card(12,Suit.HEART) );
        hand.add( new Card(14,Suit.DIAMOND) );
        hand.add( new Card(2,Suit.SPADE) );
        hand.add( new Card(7,Suit.DIAMOND) );


        hand.print();
        System.out.println("-------");
        hand.sortBySuit();



    }
}
