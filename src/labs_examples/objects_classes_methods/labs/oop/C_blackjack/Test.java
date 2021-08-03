package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Test {

    public static void main(String[] args) {

        Deck b = new Deck();

        System.out.println(b.usedCards.toString());

        Player c = new Player("Hamza");
        b.deal(c);
        b.deal(c);
        b.deal(c);


        System.out.println(c.hand.cards);
        System.out.println(c.hand.calculateScore());
        System.out.println(c.hand.checkHandValue());




    }
}
