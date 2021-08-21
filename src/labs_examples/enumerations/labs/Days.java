package labs_examples.enumerations.labs;

public enum Days {

    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);


    int i;

    Days(int i) {

        this.i = i;

    }

    public int getDayNum(){

        return this.i;
    }

}
