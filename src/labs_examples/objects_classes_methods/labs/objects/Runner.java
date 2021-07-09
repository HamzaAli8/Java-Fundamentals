package labs_examples.objects_classes_methods.labs.objects;

public class Runner {

    public static void main(String[] args) {

        Engines airEngine = new Engines("Turbojet");
        Wing wingpos = new Wing("high position");
        Fuel fuel = new Fuel("full");

        Airplane myAir = new Airplane(airEngine,wingpos,fuel,"737 Boeing.",10707.00);

        System.out.println("This airplane has a "+ myAir.getEngine().engineType + " engine." + "The wings " +
                                "are located in a "+ myAir.getWing().wingPos + ". Before departing from Heathrow " +
                                 "the fuel level was " + myAir.getFuel().CurrentFuelLevel + "." +
                                  " The model of plane we are using: " + myAir.model + " The plane has fuel cap :" + myAir.fuelCap
                                    + " Gallons");


        System.out.println(myAir.toString());
    }
}


class Engines {

    String engineType;

    public Engines(String engineType){

        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engines{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}

class Wing {

    String wingPos;

    public Wing(String wingPos){


        this.wingPos = wingPos;
    }

    @Override
    public String toString() {
        return "Wing{" +
                "wingPos='" + wingPos + '\'' +
                '}';
    }
}

class Fuel{


    String CurrentFuelLevel;



    public Fuel(String CurrentFuelLevel){

        this.CurrentFuelLevel = CurrentFuelLevel;
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "CurrentFuelLevel='" + CurrentFuelLevel + '\'' +
                '}';
    }
}
class Airplane{

    Engines engines;

    Wing wing;

    Fuel fuel;

    String model;

    double fuelCap;

    public Engines getEngine() {
        return engines;
    }

    public Wing getWing() {
        return wing;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public String getModel() {
        return model;
    }

    public double getFuelCap() {
        return fuelCap;
    }

    public Airplane(Engines engine, Wing wing, Fuel fuel, String model, Double fuelCap){

        this.engines = engine;
        this.wing = wing;
        this.fuel = fuel;
        this.model = model;
        this.fuelCap = fuelCap;


    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engines=" + engines +
                ", wing=" + wing +
                ", fuel=" + fuel +
                ", model='" + model + '\'' +
                ", fuelCap=" + fuelCap +
                '}';
    }
}

