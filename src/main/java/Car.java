import enums.ColourType;

import java.util.ArrayList;

public abstract class Car {
    private Engine engine;
    private ArrayList<Tyre> tyres;
    private Chassis chassis;
    private ArrayList<Seat> seat;
    private double price;
    private ColourType colour;
    private Gearbox gearbox;
    private String name;

    public Car(Engine engine, ArrayList<Tyre> tyres, Chassis chassis, ArrayList<Seat> seat, ColourType colour, Gearbox gearbox, String name) {
        this.engine = engine;
        this.tyres = tyres;
        this.chassis = chassis;
        this.seat = seat;
        this.colour = colour;
        this.gearbox = gearbox;
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public ArrayList<Seat> getSeat() {
        return seat;
    }

    public double getPrice() {
        return price;
    }

    public ColourType getColour() {
        return colour;
    }

    public int getTyreCount() {
        return getTyres().size();
    }

    public String getName() {
        return name;
    }
}
