package labs_examples.objects_classes_methods.labs.objects;

public class Controller1 {

    public static void main(String[] args) {

        Human sally = new Human("Sally",33);
        Dog bob = new Dog("Bob", sally);

        System.out.println("The dog:" + bob.getName() + " is owned by:" + sally.getName());

    }


}

class Human{

    String name;
    int age;


    public Human(String name, int age){

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Dog{

    String name;
    Human human;

    public Dog(String name, Human human){

        this.name = name;
        this.human = human;
    }

    public String getName() {
        return name;
    }

    public Human getHuman() {
        return human;
    }
}
