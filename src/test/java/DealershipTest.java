import enums.ColourType;
import enums.GearboxType;
import enums.MaterialType;
import enums.MetalType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

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
    private Till till;
    private Customer customer;
    private Supplier supplier;
    private Dealership dealership;

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

        till = new Till(100);
        customer = new Customer("Ross", 500 );
        supplier = new Supplier("Mercedes");
        dealership = new Dealership(supplier, till);
        dealership.addCar(electricCar);
        electricCar.setPrice(50);

    }

    @Test
    public void canSellCar(){
        customer.buyCar(dealership, "Skoda");
        assertEquals(1, customer.getGarageCount());
        assertEquals(450, customer.getWallet());
        assertEquals(150, dealership.getTill().getMoney(), 0.001);

    }
}


