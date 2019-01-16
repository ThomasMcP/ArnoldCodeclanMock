import enums.MetalType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChassisTest {

    private Chassis chassis;


    @Before
    public void before(){
        chassis = new Chassis(MetalType.LEAD);


    }

    @Test
    public void getMetalName(){
        Assert.assertEquals(MetalType.LEAD, chassis.getType());
    }
}
