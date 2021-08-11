package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */
public class Exercise_03 {
    public static void main(String[] args) {

        //DataOutputStream();

        //DataInputStream();

        //CharWriter();

        //PrintWriter();

        //BufferedStream();

        BufferWrite();



    }



    static void BufferWrite(){

        String file = "/Users/Hamza/Desktop/sample1.txt";
        String s = "/Users/Hamza/Desktop/sample1new.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(file));
             BufferedWriter bw = new BufferedWriter(new FileWriter(s))) {

            char[] buffer = new char[5];

            int g;

            while ((g = br.read(buffer)) != -1) {

                System.out.println((char)g);



            }

        }

        catch (IOException e){


            System.out.println("Exception thrown");

        }





    }

    static void BufferedStream(){

        String readFilepath = "/Users/Hamza/Desktop/sample1.txt";
        String writeFilepath = "/Users/Hamza/Desktop/sample1Ext.txt";


        try (FileInputStream fin = new FileInputStream(readFilepath);BufferedInputStream bin = new BufferedInputStream(fin);
             FileOutputStream fOut = new FileOutputStream(writeFilepath);BufferedOutputStream bOut = new BufferedOutputStream(fOut))

        {

            byte [] buffer = new byte[5];

            int bytesRead = 0;

            while((bytesRead = bin.read(buffer)) != -1) {
;

             bOut.write(buffer);

            }





        }

        catch (IOException e){


            e.printStackTrace();
            System.out.println("File exception thrown");
        }





    }

    static void PrintWriter(){

        File file = new File("output.txt");

        try(PrintWriter pw = new PrintWriter(file))

        {

            pw.write("My name is Hamza and I am writing from here to another file");



        }

        catch (IOException e){

            System.out.println("IO exception thrown");
            e.printStackTrace();
        }



    }




    static void CharWriter(){

        String filepath = "/Users/Hamza/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/meFW.txt";

        try(CharArrayWriter cw = new CharArrayWriter();
        FileWriter fw = new FileWriter(filepath))

        {

            cw.write("My name is Hamza Ali and I live in Saudi");

            char[] charArray = cw.toCharArray();

            cw.writeTo(fw);


        }

        catch (IOException e){

            e.printStackTrace();
        }



    }

    static void DataOutputStream(){

        try(FileOutputStream fOut = new FileOutputStream("Ouput.bin");
            DataOutputStream dOut = new DataOutputStream(fOut);)

        {
            dOut.writeBoolean(true);
            dOut.writeLong(9009);
            dOut.writeFloat(3.89f);
            dOut.writeInt(125);
        }

        catch (IOException e){

            e.printStackTrace();
        }
    }

    static void DataInputStream(){

        try(FileInputStream fin = new FileInputStream("Ouput.bin");
            DataInputStream din = new DataInputStream(fin);)

        {

            boolean boolVal = din.readBoolean();
            long longVal = din.readLong();
            float floatVal = din.readFloat();
            int intVal = din.readInt();

            System.out.println(boolVal);
            System.out.println(intVal);
            System.out.println(longVal);
            System.out.println(floatVal);

        }


        catch (IOException e){

            e.printStackTrace();
        }




    }




}
