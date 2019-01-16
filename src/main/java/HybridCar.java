import enums.ColourType;

import java.util.ArrayList;

public class HybridCar  extends Car {
    public HybridCar(Engine engine, ArrayList<Tyre> tyres, Chassis chassis, ArrayList<Seat> seat, ColourType colour, Gearbox gearbox, String name) {
        super(engine, tyres, chassis, seat, colour, gearbox, name);
    }


}
