package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        int [][] array = new int[5][4];

        int count = 0;

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array[i].length; j++){


                array[i][j]= count;
                count += 5;


                }

            }
            for(int[] i : array ){

                for(int j : i){

                    System.out.print(j + " | ");
                }

                System.out.println();


            }
            }
        }




