package labs_examples.objects_classes_methods.labs.objects;

public class Controller2 {

    public static void main(String[] args) {

        Student stu1 = new Student(23,"Ali",1.88,3.66);
        Student stu2 = new Student("Hamza","35471425",3.54);
        Student stu3 = new Student();
        stu3.id = "475830203";
        stu3.age = 33;
        stu3.height = 1.93;
        stu3.name = "Sami";


        System.out.println(stu3.toString());
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());

    }

}

class Student{

    int age;
    String name;
    double height;
    double GPA;
    String id;


    public Student(int age, String name, double height, double GPA){


        this.age = age;
        this.name = name;
        this.height = height;
        this.GPA = GPA;

    }

    public Student(){


    }

    public Student(String name, String id, double GPA){

        this.name = name;
        this.id = id;
        this.GPA = GPA;

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", GPA=" + GPA +
                ", id='" + id + '\'' +
                '}';
    }
}