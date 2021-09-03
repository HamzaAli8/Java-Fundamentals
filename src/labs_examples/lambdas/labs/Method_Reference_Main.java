package labs_examples.lambdas.labs;

public class Method_Reference_Main {


    public static void main(String[] args) {

        Method_Reference obj = Sum_Method ::add;

        obj.calculate(3,4);

        Method_Reference obj2 = new Sum_Method()::product;

        obj2.calculate(5,6);

        Method_construct I = Reference_construct::new;

        I.t1();



    }
}
