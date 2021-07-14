package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class ArrowMan extends CharacterAttack{

    private int arrows;

    public ArrowMan(int level, int damageLevel,int arrows) {
        super(level, damageLevel);
        this.arrows = arrows;
    }

    void throwArrow(){

        System.out.println("Arrow thrown!!");
    }

    void kick(){

        System.out.println("Arrowman kicks!");

    }

    void punch(){

        System.out.println("Arrowman punches!");
    }

    public int getArrows() {

        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
}
