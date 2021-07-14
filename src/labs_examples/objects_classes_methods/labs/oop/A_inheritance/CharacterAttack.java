package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class CharacterAttack extends CharacterTest {

    private int damageLevel;


    public CharacterAttack(int level, int damageLevel) {
        super(level,100);
        this.damageLevel = damageLevel;
    }

    void kick(){

        System.out.println("Kick!");
    }

    void punch(){

        System.out.println("Punch!");

    }


}
