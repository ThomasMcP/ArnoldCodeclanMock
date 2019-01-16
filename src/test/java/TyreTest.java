import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    private Tyre tyre;

    @Before
    public void before() {
        tyre = new Tyre(42);
    }

    @Test
    public void getSize() {
        assertEquals(42, tyre.getSize());
    }
}
