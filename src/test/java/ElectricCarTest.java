import enums.ColourType;
import enums.GearboxType;
import enums.MaterialType;
import enums.MetalType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ElectricCarTest {

    private ElectricCar electricCar;
    private Engine engine;
    private Tyre tyre1, tyre2, tyre3, tyre4;
    private ArrayList<Tyre> tyres;
    private Chassis chassis;
    private Seat seat1, seat2, seat3, seat4;
    private ArrayList<Seat> seats;
    private double price;
    private ColourType colour;
    private Gearbox gearbox;

    @Before
    public void before() {
        engine = new Engine("electric");

        tyre1 = new Tyre(42);
        tyre2 = new Tyre(42);
        tyre3 = new Tyre(42);
        tyre4 = new Tyre(42);

        tyres = new ArrayList<>();
        tyres.add(tyre1);
        tyres.add(tyre2);
        tyres.add(tyre3);
        tyres.add(tyre4);

        chassis = new Chassis(MetalType.LEAD);

        seat1 = new Seat(MaterialType.METAL, ColourType.GREEN);
        seat2 = new Seat(MaterialType.METAL, ColourType.GREEN);
        seat3 = new Seat(MaterialType.METAL, ColourType.GREEN);
        seat4 = new Seat(MaterialType.METAL, ColourType.GREEN);

        seats = new ArrayList<>();
        seats.add(seat1);
        seats.add(seat2);
        seats.add(seat3);
        seats.add(seat4);

        colour = ColourType.GREEN;

        gearbox = new Gearbox(6, GearboxType.AUTOMATIC);

        electricCar = new ElectricCar(engine, tyres, chassis, seats, colour, gearbox, "Skoda");

    }

    @Test
    public void hasTyres() {
        assertEquals(4, electricCar.getTyreCount());
    }

    @Test
    public void hasSeatsWithMaterialTypeName() {
        assertEquals("Metal", electricCar.getSeat().get(0).getMaterial().getMaterial());
    }

}