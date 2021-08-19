package labs_examples.objects_classes_methods.labs.oop.C_blackjack;


import java.util.Scanner;

public class BlackJackController_Final {

    public static void main(String[] args) {

        BlackJackController_Final obj = new BlackJackController_Final();
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

            dealInitialCards(user, computer, deck);

            displayHands(user, computer);

            dealUserAdditionalCards(user, deck);
            dealComputerAdditionalCards(computer, deck);

            determineWinner(user, computer);

            printScores(user, computer);


            if (user.potValue > 0){
                newGame = checkForNewGame();
            }

            else break;
        }

        if(user.potValue > 0){

            System.out.println("Thanks for playing!" + "\nWell done you leave with $" + user.potValue);
        } else {
            System.out.println("Game over :(");
            System.out.println("Remember the house always wins! ;)");
        }
    }

    private boolean checkForNewGame() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play another game? (Y/N)");
        String input = scanner.next();

        if (input.equalsIgnoreCase("n")) {
            return false;
        }
        return true;
    }

    /**
     * This method takes the scores from both the user and the computer and prints their
     * relative scores onto the command line.
     *
     * @param user
     * @param computer
     */

    private void printScores(Player user, Player computer) {

        System.out.println("Dealer score: " + computer.hand.calculateScore());
        computer.printHand();
        System.out.println();
        System.out.println("Your score :" + user.hand.calculateScore());
        user.printHand();
        System.out.println();
    }
    /**
     * This method determines who out of the user and or the computer has won the round.
     *
     * @param user - The user player object.
     * @param computer - The dealer player object.
     */
    private void determineWinner(Player user, Player computer)
    {
        boolean playerWins = false;

        if (computer.hand.handValue <= 21 && user.hand.handValue <= 21) {
            if (computer.hand.handValue > user.hand.handValue) {
                System.out.println("Dealer wins");
                user.potValue -= user.bet;
            }
            else if(computer.hand.handValue == user.hand.handValue){
                System.out.println("PUSH");
            }
            else  {
                user.potValue += user.bet;
                System.out.println("You win " + "$" + user.bet);
                playerWins = true;
            }
        } else if (computer.hand.handValue == user.hand.handValue) {
            System.out.println("PUSH");
        } else if (computer.hand.handValue > 21 && user.hand.handValue > 21) {
            System.out.println("PUSH");
        } else if (computer.hand.handValue > 21) {
            System.out.println("You win " + "$" + user.bet);
            user.potValue += user.bet;
            playerWins = true;
        } else {
            System.out.println("Dealer wins");
            user.potValue -= user.bet;
        }
        user.setGamesPlayed(user.getGamesPlayed() + 1);
        if(playerWins){

            user.setGamesWon(user.getGamesWon() + 1);
        }
        System.out.println("Number of games played: " + user.getGamesPlayed());
        System.out.println("Number of games won:  " + user.getGamesWon());
    }

    /**
     * This method checks the value of the hand that the computer has been dealt and depending on that value
     * hand the computer will be dealt additional card/s.
     *
     * @param computer
     * @param deck
     */

    private void dealComputerAdditionalCards(Player computer, Deck deck) {

        while(computer.computerAI()) {
            deck.deal(computer);
            if (computer.hand.handValue > 21) {
                System.out.println("Dealer bust! Hand currently valued at" + computer.hand.calculateScore());
            }
        }
    }

    /**
     * This methods prompts the user should they require any additional cards, and depending on the response
     * the user is given an additional card or is allowed to stand on their current set of cards.
     *
     * @param user
     * @param deck
     */

    private void dealUserAdditionalCards(Player user, Deck deck) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would user like another card? (Y/N)");
        String response = scanner.next();
        while(response.equalsIgnoreCase("Y")) {
            deck.deal(user);
            user.printHand();
            System.out.println("Your hand is valued at :" + user.hand.calculateScore());
            if (user.hand.checkHandValue()) {
                System.out.println("Bust! Hand currently valued at:" + user.hand.calculateScore());
            }
            System.out.println("Would user like another card? (Y/N)");
            response = scanner.next();
        }
    }

    /**
     * This methods works by taking the both the user and computer's first two cards and displays
     * them onto the console. The computer's hand has the extra functionality that only the first card is shown.
     * @param user
     * @param computer
     */

    private void displayHands(Player user, Player computer) {

        System.out.println("Here are your first 2 cards:");
        user.printHand();
        System.out.println("");
        System.out.println("Your hand is valued at:  " + user.hand.calculateScore());
        System.out.println("Dealer cards: ");
        computer.compPrintHand();
    }

    /**
     * This method simply deals the first two cards for both the user player and computer player.
     * @param user
     * @param computer
     * @param deck
     */

    private void dealInitialCards(Player user, Player computer, Deck deck) {

        deck.deal(user);
        deck.deal(user);

        deck.deal(computer);
        deck.deal(computer);
    }

    /** This method starts the game from anew, a new deck is set up. The user and the computer are
     * both dealt a new hand from the new deck.
     * @param user
     * @param computer
     * @param deck
     */

    private void refreshGame(Player user, Player computer, Deck deck) {

        deck = new Deck();
        user.hand = new Hand();
        computer.hand = new Hand();
    }

    /**
     * This method introduce the player to the game and return a player object that takes
     * a string parameter for the user 'name'. A message is printed onto the console with the name
     * entered from the scanner.
     * @return
     */
    private  Player initialisePlayer() {

        System.out.println("Hi welcome to BlackJack, please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Player user = new Player(name);

        return user;
    }
}