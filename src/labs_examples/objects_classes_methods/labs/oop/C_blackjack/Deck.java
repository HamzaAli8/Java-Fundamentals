package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    ArrayList<Card> deck;
    ArrayList<Integer> usedCards;
    char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};


    public Deck(){

        deck = new ArrayList<Card>();
        createDeck();
        usedCards = new ArrayList<Integer>();
    }



    public void  createDeck(){

        for (char suit: suits){

            for (String rank: ranks){

                deck.add(new Card(suit,rank));
            }
        }
    }

    public void refreshDeck(){

        deck.clear();
        deck = new ArrayList<Card>();
        createDeck();

    }



   public String toString(){
        String deckCard = "";
        int i = 1;
        for(Card aCard: deck){

            deckCard += "\n" + i + "-" + aCard.toString();
            i++;
       }
     return deckCard;
    }

    public void deal(Player player){

        Random r = new Random();

        int num = r.nextInt(52);

        while (usedCards.contains(num)){

            num = r.nextInt(52);
        }
        usedCards.add(num);

        player.hand.cards.add(deck.get(num));
    }


}










