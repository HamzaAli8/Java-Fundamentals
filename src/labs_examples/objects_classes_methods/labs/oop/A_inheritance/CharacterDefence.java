package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class CharacterDefence extends CharacterTest {

    private int defenceLevel;


    public CharacterDefence(int level, int defenceLevel) {
        super(level, 100);
        this.defenceLevel = defenceLevel;

    }

    void shield(){

        System.out.println("Shield!");
    }

    void block(){

        System.out.println("Block!");
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }
}
