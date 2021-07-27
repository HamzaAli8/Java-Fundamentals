package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Player {

    private int age;
    private float height;
    private String position;
    private String foot;



    public Player(int age, float height, String position, String foot){

        this.age = age;
        this.height = height;
        this.position = position;
        this.foot = foot;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public String getPosition() {
        return position;
    }

    public String getFoot() {
        return foot;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }
}


