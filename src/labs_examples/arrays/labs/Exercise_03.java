package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int [] [] twoD = new int[5][5];

        int counter = 3;

        for(int i = 0; i < twoD.length; i++){
            for(int j= 0; j < twoD[i].length; j++){

                twoD[i][j] += counter;
                counter += 3;

                System.out.print(twoD[i][j] + " | ");
            }

            System.out.println();
        }
        
    }
}
