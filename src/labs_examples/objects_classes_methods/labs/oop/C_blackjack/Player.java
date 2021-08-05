package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player extends Exception {

    String name;
    Hand hand;
    int potValue;
    int bet;


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

    public void compPrintHand(){

        System.out.println( hand.cards.get(0).toString() +
                " and [Hidden] ");


    }



    public boolean computerAI(){
        hand.calculateScore();
        return hand.handValue < 17;

    }

    public void handleBet() {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Pot: $" + potValue + "\nHow much would you like to bet?");
            int bet = scanner.nextInt();
            while (bet > potValue) {
                System.out.println("Not enough money to bet!");
                System.out.println("Please provide input not more than your pot");
                System.out.println("Pot: $" + potValue + "\nHow much would you like to bet?");
                bet = scanner.nextInt();
            }
            this.bet = bet;
        }

        catch (Exception exc ){

            System.out.println("Something went wrong.");
            System.out.println("Please enter number value");

        }


    }

    @Override
    public String toString() {
        return "potValue =" + potValue +
                '}';
    }
}
