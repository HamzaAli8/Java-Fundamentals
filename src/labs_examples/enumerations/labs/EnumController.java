package labs_examples.enumerations.labs;

public class EnumController {

    public static void main(String[] args) {

        Days d1 = Days.MONDAY;
        Days d2 = Days.FRIDAY;

        if(d1 == Days.MONDAY){

            System.out.println("What a depressing day :(");
        }
        if (d2 == Days.FRIDAY){

            System.out.println("Woooooo Hooooooo!!!!");
        }

        for (Days day : Days.values()){

            System.out.println(day);
        }

        System.out.println(d1.getDayNum());
        System.out.println(d2.getDayNum());

    }


}
