import enums.GearboxType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearboxTest {
    private Gearbox gearbox;

    @Before
    public void before() {
        gearbox = new Gearbox(6, GearboxType.MANUAL);
    }

    @Test
    public void hasNumberOfGears() {
        assertEquals(6, gearbox.getNumberOfGears());
    }

    @Test
    public void hasGearBoxType () {
        assertEquals("manual", gearbox.getGearboxType().getType());
    }
}
