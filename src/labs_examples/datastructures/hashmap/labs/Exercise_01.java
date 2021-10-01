package labs_examples.datastructures.hashmap.labs;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */
class HashMapMethods{

    public static void main(String[] args) {


        HashMap<String, Integer> myMap = new HashMap<>();
        HashMap<String, Integer> myMap2 = new HashMap<>();

        myMap.put("Hamza", 33);
        myMap.put("Arnold", 45);
        myMap.put("Samir", 36);
        myMap.put("Stephen", 22);
        myMap.put("Ali", 43);

        myMap2.put("John", 34);
        myMap2.put("Gary", 49);
        myMap2.put("Neal", 26);
        myMap2.put("Thierry", 29);
        myMap2.put("Jones", 30);
        myMap2.put("Ken", 24);





        myMap.get("Ali");



        myMap.putAll(myMap2);

        int c = myMap.size();

        boolean b = myMap.containsKey("Smith");

        Set<String> s;

        s = myMap.keySet();

        System.out.println(s);

        System.out.println(myMap.entrySet());

        System.out.println(myMap.putIfAbsent("Hamza", 33));
        System.out.println(myMap.putIfAbsent("Samir", 36));

        myMap.forEach((k, v) -> System.out.println(k + ":" + v));

        myMap.replace("Hamza",34);

        System.out.println();

        myMap.forEach((k, v) -> System.out.println(k + ":" + v));

        myMap.remove("Ali");

        myMap.clear();

        myMap.forEach((k, v) -> System.out.println(k + ":" + v));










    }
}