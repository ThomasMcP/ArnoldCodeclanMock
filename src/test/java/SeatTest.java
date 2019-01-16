import enums.ColourType;
import enums.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatTest {

    private Seat seat;

    @Before
    public void before(){
        seat = new Seat(MaterialType.METAL, ColourType.BLUE);
    }

    @Test
    public void getMaterialType(){
        assertEquals("Metal", seat.getMaterial().getMaterial());
    }

    @Test
    public void getColourType(){
        assertEquals("Blue", seat.getColour().getColour());
    }


}
