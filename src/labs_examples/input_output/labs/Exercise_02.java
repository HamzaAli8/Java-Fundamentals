package labs_examples.input_output.labs;

import java.io.*;
import java.nio.CharBuffer;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */



public class Exercise_02 {

    public static void main(String[] args) {

        String filePath = "/Users/Hamza/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data.txt";
        String outPath = "/Users/Hamza/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_dataEncrypted.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
         BufferedWriter bw = new BufferedWriter(new FileWriter(outPath)))

        {
            int s;

            while((s = br.read()) != -1){

                if(s == (int)'a')
                    s = '-';
                if(s == (int)'e')
                    s = '~';
                bw.write((char)s);
            }
        }

        catch (IOException e){

            e.printStackTrace();
        }



    }


}





