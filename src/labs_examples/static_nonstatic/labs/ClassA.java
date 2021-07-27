package labs_examples.static_nonstatic.labs;

public class ClassA {

    public static void main(String[] args) {

    }

    static void StatMethod() {

        System.out.println("Static method Class A");

    }

    @Override
    public String toString() {
        return "ClassA{}";
    }

    void NonStatMethod(){

        System.out.println("Non-static method Class A");

        ClassB.StatMethod();


    }


}

