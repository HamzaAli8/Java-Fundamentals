package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have: " + potValue + " ,how much would you like to bet?");
        int bet = scanner.nextInt();
        while (bet > potValue) {
            System.out.println("Not enough money to bet!!");
            System.out.println("Please provide input not more than your pot");
            System.out.println("You have: " + potValue + " ,how much would you like to bet?");
            bet = scanner.nextInt();
        }

        this.bet = bet;

    }

    @Override
    public String toString() {
        return "potValue =" + potValue +
                '}';
    }
}
