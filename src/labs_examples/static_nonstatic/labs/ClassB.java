package labs_examples.static_nonstatic.labs;

public class ClassB {

    public static void main(String[] args) {

       // StatMethod();

        //ClassB obj = new ClassB();

        //obj.NonStatMethod();

        //ClassA.StatMethod();

        //ClassA obj2 = new ClassA();

        //obj2.NonStatMethod();


    }

    static void StatMethod(){

        System.out.println("Static method Class B");
    }

    void NonStatMethod(){

        System.out.println("Non-static method Class B");

        //NonStatMethod2();
        //StatMethod();
    }

    void NonStatMethod2(){

        System.out.println("Non-static method2 Class B");

        //ClassA obj3 = new ClassA();
        //obj3.NonStatMethod();


        ClassA.StatMethod();
    }
}
