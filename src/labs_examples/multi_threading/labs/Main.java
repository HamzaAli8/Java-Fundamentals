package labs_examples.multi_threading.labs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> bucket = new ArrayList<Integer>();

    public static void main(String[] args) {


        Runnable p1 = new Producer("p1");
        Runnable p2 = new Producer("p2");
        Runnable c1 = new Consumer("c1");
        Runnable c2 = new Consumer("c2");

    }



}
