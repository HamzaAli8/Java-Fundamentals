package labs_examples.objects_classes_methods.labs.methods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MethodTraining {


    public static void main(String[] args) {

        //System.out.println(multiply(3.4f,4.7f));
        //children();
        //int x = 50;
        //System.out.println(x);
        //change(x);
        // System.out.println(x);

        //largestNum(34,24,95,86,56,88,102);

        //primeNum(169);

        //reversString("ball");

        int [] a = {4,8,9,20,34,22,19,85,12,3};

        returnArray(a);

        //divideArray(100,2,4);


    }

    public static int multiply(int a, int b) {

        return a * b;
    }

    public static float multiply(float a, float b) {

        return a * b;
    }

    public static void children() {

        Human person = new Human();
        person.age = 5;
        person.name = "Aminah";
        person.favColor = "Pink";
        System.out.println(person.age);
        changeChildren(person);
        System.out.println(person.age);
        System.out.println(person.favColor);
        changeColor(person);
        System.out.println(person.favColor);
        System.out.println(person.favColor);


    }

    static void changeChildren(Human newChild) {

        newChild.age = newChild.age + 4;

    }

    static void changeColor(Human newColor) {

        newColor.favColor = "Green";
    }

    static void change(int val) {

        val = val * 2;
        System.out.println(val);
    }

    public static void largestNum(int... parameters) {

        int max = parameters[0];

        int i;


        for (i = 0; i < parameters.length; i++)


            if (parameters[i] > max)
                max = parameters[i];

        System.out.println(max);
    }

    public static void primeNum(int a) {


        Boolean isPrime = true;

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {

                isPrime = false;
                break;
            }
        }
        if(isPrime){

            System.out.println("It's prime!");
        }
        else{
            System.out.println("It's not prime!");
        }
    }

    public static String reversString(String s){
        int count = 0;
        char [] ch = new char[s.length()];
        char [] vowels = {'a','e','o','i','u'};

        for(int i = 0;i < s.length();i++){


            ch[i]= s.charAt(i);

        }


        for(char c : ch){

            if(c == 'a'){

                continue;


            }

            else if (c == 'e'){

                continue;
            }

            else if (c == 'o'){

                continue;
            }

            else if (c == 'u'){

                    continue;
            }
            else if (c == 'i'){

                continue;
            }
            else {

               count ++;
            }
        }
        System.out.println(count);
        return s;

    }
    public static int [] returnArray (int [] arr){

        int max = arr[0];
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){

                max = arr[i];
            }

        }

        for(int j = 0; j < arr.length; j++){

            int min = arr[0];

            if(arr[j] < min){

                min = arr[j];
            }

            System.out.println(min);
        }
        System.out.println(max);

        Arrays.fill(arr,max);

        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static ArrayList divideArray(int maxNum, int divisor1, int divisor2){

        ArrayList<Integer> list = new ArrayList<Integer>();

        while(maxNum != 0){

            int a = maxNum - 1;

            list.add(a);

            if(a % divisor1 != 0 && a % divisor2 != 0){

                list.remove(a);
            }


        }

        return list;


    }
}