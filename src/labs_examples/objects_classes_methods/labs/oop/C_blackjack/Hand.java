package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards;
    static int numberOfGames;
    int handValue;

    public Hand(){


        cards = new ArrayList<Card>();
    }

    public int calculateScore()
    {
        handValue= 0;
        for(Card c: cards){

            handValue = c.getCardValue() + handValue;

            if(c.rank == "Ace"){

                if(handValue > 10){

                    handValue += 0;
                }

                else handValue += 10;
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


