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
        boolean hasAce = false;
        handValue= 0;
        for(Card c: cards){

            handValue = c.getCardValue() + handValue;

            if(c.rank == "Ace"){

                if(!hasAce) {
                    handValue += 10;
                    hasAce = true;
                }else {
                    handValue += 0;
                }
            }
        }
        return handValue;
    }

    public boolean checkHandValue(){

        if (handValue > 21){

            return true;
        }

        else return false;
    }



}


