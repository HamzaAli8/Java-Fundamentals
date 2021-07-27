package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    ArrayList<Card> deck;
    ArrayList<Integer> usedCards;
    char[] Suits = new char[]{'♠', '♦', '♥', '♣'};
    String[] Ranks = {"Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};


    public Deck(){

        this.deck = new ArrayList<Card>();
    }



    public void  createDeck(){

        for (char suit: Suits){

            for (String rank: Ranks){

                this.deck.add(new Card(suit,rank));
            }
        }
    }

   public String toString(){
        String deckCard = "";
        int i = 1;
        for(Card aCard: this.deck){

            deckCard += "\n" + i + "-" + aCard;
            i++;
       }
     return deckCard;
    }
}










