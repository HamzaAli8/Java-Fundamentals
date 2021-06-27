package labs_examples.conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");

        String str = scanner.nextLine().toLowerCase();

        int c = str.length();

        System.out.println(str);

        for(int i = 0; i < c; i++ ){

            char x = str.charAt(i);

            if(x == 'a'){
                System.out.println("a");
                break;
            }
            else if (x == 'e'){
                System.out.println("e");
                break;
            }
            else if (x == 'o'){
                System.out.println("o");
                break;
            }
            else if(x == 'u'){
                System.out.println("u");
                break;


            }
            }
    }

}

