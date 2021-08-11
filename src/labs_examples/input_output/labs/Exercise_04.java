package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;


/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        String filepath = "/Users/Hamza/Desktop/freshman_kgs.csv";
        String OutPath = "/Users/Hamza/Desktop/freshman_kgsEdited.csv;";
        String line = "";
        String [] values;
        ArrayList<Freshman> freshmen = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filepath));
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(OutPath)))

        {

            while((line = br.readLine()) != null){

                 values = line.split(",");

                 Freshman obj = new Freshman();

                 obj.setSex(values[0]);
                 obj.setWeightSept(values[1]);
                 obj.setWeightApr(values[2]);
                 obj.setBmiSept(values[3]);
                 obj.setBmiApr(values[4]);

                freshmen = new ArrayList<>();

                freshmen.add(obj);

            }

            for(Freshman f : freshmen){


                objOut.writeObject(freshmen);
            }

        }

        catch (IOException e){

            e.printStackTrace();
            System.out.println("Exception thrown");
        }

    }


}