package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class CharacterTest {

    private int level;
    private int healthlevel;


    public CharacterTest(int level, int healthlevel){


        this.level = level;
        this.healthlevel = healthlevel;

    }

    public int getLevel() {
        return level;
    }

    void run(){

        System.out.println("Run!");
    }

    void jump(){

        System.out.println("Jump!");
    }
}
