package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    String name;
    Hand hand;
    int potValue;


    public Player(String name){

        this.name = name;

        this.potValue = 100;

        hand = new Hand();
    }

    public Player() {

        hand = new Hand();

    }

    public void printHand() {

        for(Card c: hand.cards){

            System.out.print(c.toString() + " | ");
        }
    }

    public boolean computerAI(){
        if(hand.handValue >= 17){

            return false;
        }

        else return true;



    }

    @Override
    public String toString() {
        return "potValue =" + potValue +
                '}';
    }
}
