package Hamza;




import java.util.*;
import java.util.Iterator;

    class Main {
        public static void main(String[] args) {
            HashMap<String, Integer> cityPopulations = new HashMap();
            HashMap<String, Integer> cityPopulations2 = new HashMap();

            // add several cities (key )and their populations (value )to the HashMap
            cityPopulations.put("London", 10);
            cityPopulations.put("Berlin", 6);
            cityPopulations.put("Tokyo", 23);
            cityPopulations.put("New York", 12);
            cityPopulations.put("Cairo", 15);


            // retrieve the population of each city using the key

            for (String key : cityPopulations.keySet()) {
                Integer value = cityPopulations.get(key);
                System.out.println("Key = " + key + ", Value = " + value);}


                // print each element (key and value) in the HashMap

                Set entries = cityPopulations.entrySet();
                Iterator iterator = entries.iterator();

                while (iterator.hasNext()) {
                    Map.Entry cityPop = (Map.Entry) iterator.next();
                    System.out.println(" The key is: " + cityPop.getKey()
                            + " and the value is: " + cityPop.getValue().toString());
                }

                // demonstrate at least 3 other HashMap methods

                boolean y = cityPopulations.isEmpty();
                HashMap<String, Integer> cityPopulations3 = (HashMap<String, Integer>) cityPopulations.clone();
                int x = cityPopulations.get("Berlin");

            System.out.println(y);
            System.out.println(cityPopulations3);
            System.out.println(x);


            }
        }

