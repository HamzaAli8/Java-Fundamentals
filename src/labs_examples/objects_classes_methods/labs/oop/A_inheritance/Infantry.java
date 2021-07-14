package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Infantry  extends CharacterDefence{

    private int numBlocks;
    private int numShields;


    public Infantry(int level, int defenceLevel,int numBlocks,int numShields) {
        super(level, defenceLevel);
        this.numBlocks = numBlocks;
        this.numShields = numShields;

    }

    void block (){

        System.out.println("Infantry blocks!");
    }

    void shield (){


        System.out.println("Infantry shields!");
    }

    public int getNumBlocks() {
        return numBlocks;
    }

    public int getNumShields() {
        return numShields;

    }

    public void setNumBlocks(int numBlocks) {
        this.numBlocks = numBlocks;
    }

    public void setNumShields(int numShields) {
        this.numShields = numShields;
    }
}
