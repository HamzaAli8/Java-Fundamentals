package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class RunCharacter {
    public static void main(String[] args) {

        ArrowMan char1 = new ArrowMan(10,50,20);

        char1.kick();
        char1.punch();

        CharacterAttack char2 = new CharacterAttack(20,50);


        char2.kick();
        char1.kick();
    }
}
