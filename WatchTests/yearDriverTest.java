import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class yearDriverTest  {
    @Test
    public void year_Driver_Test()
    {
        year.incrementYear();
        Assert.assertEquals(2001,year.getYear());
    }


}