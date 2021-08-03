package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards;
    int handValue;

    public Hand(){


        cards = new ArrayList<Card>();
    }

    public int calculateScore()
    {
        handValue= 0;
        for(Card c: cards){

            handValue = c.getCardValue() + handValue; }
        return handValue;

    }

    public boolean checkHandValue(){

        if (handValue > 21){

            return true;
        }

        else return false;
    }

}


