package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Thread.sleep;


public class BlackJackController {

    public static void main(String[] args) {

        playBlackJack();
    }

    static void playBlackJack() {

        Deck firstDeck = new Deck();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.next();
        Player user = new Player(name);
        Player computer = new Player();



        firstDeck.deal(user);
        firstDeck.deal(user);
        user.printHand();
        System.out.println("Your hand is valued at:  " + user.hand.calculateScore());

        boolean endRound = false;


        System.out.println("Computer here are your first 2 cards");



        firstDeck.deal(computer);
        firstDeck.deal(computer);
        computer.printHand();
        System.out.println("Computer hand is valued at : " + computer.hand.calculateScore());

        while (endRound == false) {

            System.out.println("Would user like another card? (Y/N)");

            String response = scanner.next();
            if (response.equalsIgnoreCase("Y")) {
                firstDeck.deal(user);
                user.printHand();
                System.out.println("Your hand is valued at :" + user.hand.calculateScore());
                if (user.hand.checkHandValue()) {

                    System.out.println("Bust! Hand currently valued at:" + user.hand.calculateScore());
                    break;
                }
                System.out.println("Would user like another card? (Y/N)");
                response = scanner.next();
                if (response.equalsIgnoreCase("Y"))
                    firstDeck.deal(user);
                user.printHand();
                System.out.println("Your hand is valued at :" + user.hand.calculateScore());
                if (user.hand.checkHandValue()) {
                    System.out.println("You bust! Hand currently valued at:" + user.hand.calculateScore());
                    endRound = true;
                    break;
                }
            }



                if (computer.computerAI()) {

                    firstDeck.deal(computer);
                    if (computer.hand.handValue > 21) {

                        System.out.println("Computer bust! Hand currently valued at" + computer.hand.calculateScore());
                        endRound = true;
                    }
                    computer.printHand();
                    System.out.println("Computer hand is valued at: " +
                            computer.hand.calculateScore());
                }


            if (computer.hand.handValue <= 21 && user.hand.handValue <= 21) {
                if (computer.hand.handValue > user.hand.handValue) {

                    System.out.println("Computer Wins");
                    endRound = true;
                } else System.out.println("You win") ;
                endRound = true;
            } else if (computer.hand.handValue > 21 && user.hand.handValue > 21) {

                System.out.println("Nobody wins");
                endRound = true;
            }
            else if (computer.hand.handValue == user.hand.handValue){

                System.out.println("nobody wins");
            }

            else if (computer.hand.handValue > 21) {

                System.out.println("You win!!");
                endRound = true;

            } else System.out.println("Computer wins");
            endRound = true;
            System.out.println("Computer score: " + computer.hand.calculateScore());
            System.out.println("Your score :" + user.hand.calculateScore());
        }

    }
}