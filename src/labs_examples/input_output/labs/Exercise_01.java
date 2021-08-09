package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {





        String readFilepath = "/Users/Hamza/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data.txt";
        String writeFilepath = "/Users/Hamza/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_dataC1.txt";


        try (FileInputStream fin = new FileInputStream(readFilepath);BufferedInputStream bin = new BufferedInputStream(fin);
            FileOutputStream fOut = new FileOutputStream(writeFilepath);BufferedOutputStream bOut = new BufferedOutputStream(fOut))

        {
            byte [] buffer = new byte[5];

            int bytesRead = 0;

            while((bytesRead = bin.read(buffer)) != -1) {


                bOut.write(buffer,0,bytesRead);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found error");

        } catch (IOException e){
            System.out.println("IO exception");
            e.printStackTrace();
        }


        }


}