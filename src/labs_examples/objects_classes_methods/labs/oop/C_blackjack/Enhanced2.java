package labs_examples.objects_classes_methods.labs.oop.C_blackjack;


import java.util.Scanner;

public class Enhanced2 {

    public static void main(String[] args) {

        Enhanced2 obj = new Enhanced2();
        obj.playBlackJack();

    }

     void playBlackJack() {

        Player user = initialisePlayer();
        Player computer = new Player();
        Deck deck = new Deck();
        boolean newGame = true;

        while (user.potValue > 0 && newGame) {

            refreshGame(user,computer,deck);

            user.handleBet();
            boolean endRound = false;

            dealInitialCards(user, computer, deck);

            while (!endRound) {

                displayHands(user, computer);

                endRound = dealUserAdditionalCards(user, deck);
                endRound = dealComputerAdditionalCards(computer, deck);


                determineWinner(user, computer);

                printScores(user, computer);

            }
            if (user.potValue > 0){

                newGame = checkForNewGame();
            }

            else break;


        }
        if(user.potValue > 0){

            System.out.println("Thanks for playing!" + "\nWell done you leave with $" + user.potValue);
        }

        else {
            System.out.println("Game over :(");
            System.out.println("Remember the house always wins! ;)");
        }

    }

    private boolean checkForNewGame() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play another game? (Y/N)");
        String input = scanner.next();

        if (input.equalsIgnoreCase("n")){

            return false;
        }
        return true;
    }

    private void printScores(Player user, Player computer) {

        System.out.println("Dealer score: " + computer.hand.calculateScore());
        computer.printHand();
        System.out.println();
        System.out.println("Your score :" + user.hand.calculateScore());
        user.printHand();
        System.out.println();
    }

    private void determineWinner(Player user, Player computer)
    {
        if (computer.hand.handValue <= 21 && user.hand.handValue <= 21) {
            if (computer.hand.handValue > user.hand.handValue) {
                System.out.println("Dealer wins");
                user.potValue -= user.bet;
            }
            else if(computer.hand.handValue == user.hand.handValue)
            {   System.out.println("PUSH");

            }
            else  {user.potValue += user.bet;
            System.out.println("You win " + "$" + user.bet);}
        }
        else if (computer.hand.handValue == user.hand.handValue)
        {System.out.println("PUSH");}

        else if (computer.hand.handValue > 21 && user.hand.handValue > 21) {
            System.out.println("PUSH"); }

        else if (computer.hand.handValue > 21) {

            System.out.println("You win " + "$" + user.bet);
            user.potValue += user.bet;
        }

        else {
            System.out.println("Dealer wins");
            user.potValue -= user.bet;
        }
    }




    private boolean dealComputerAdditionalCards(Player computer, Deck deck) {

        while(computer.computerAI()) {
            deck.deal(computer);
            if (computer.hand.handValue > 21) {
                System.out.println("Dealer bust! Hand currently valued at" + computer.hand.calculateScore());
                return true;
            }
        }
        return true;
    }

    private boolean dealUserAdditionalCards(Player user, Deck deck) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would user like another card? (Y/N)");
        String response = scanner.next();
        while(response.equalsIgnoreCase("Y")) {
            deck.deal(user);
            user.printHand();
            System.out.println("Your hand is valued at :" + user.hand.calculateScore());
            if (user.hand.checkHandValue()) {
                System.out.println("Bust! Hand currently valued at:" + user.hand.calculateScore());
                return true;
            }
            System.out.println("Would user like another card? (Y/N)");
            response = scanner.next();
        }
        return true;
    }

    private void displayHands(Player user, Player computer) {
        System.out.println("Here are your first 2 cards:");
        user.printHand();
        System.out.println("");
        System.out.println("Your hand is valued at:  " + user.hand.calculateScore());

        System.out.println("Dealer cards: ");
        computer.compPrintHand();
    }

    private void dealInitialCards(Player user, Player computer, Deck deck) {

        deck.deal(user);
        deck.deal(user);

        deck.deal(computer);
        deck.deal(computer);
    }



    private void refreshGame(Player user, Player computer, Deck deck) {

        deck = new Deck();
        user.hand = new Hand();
        computer.hand = new Hand();
    }

    private  Player initialisePlayer() {

        System.out.println("Hi welcome to BlackJack,please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Player user = new Player(name);

        return user;


    }
}