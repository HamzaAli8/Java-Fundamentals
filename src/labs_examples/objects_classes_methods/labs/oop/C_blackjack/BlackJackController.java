package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;


public class BlackJackController {

    public static void main(String[] args) {

        Deck firstDeck = new Deck();

        firstDeck.createDeck();

        System.out.println(firstDeck.toString());



    }

}