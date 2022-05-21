import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
public class dayDriverTest  {
    @Test
    public void monthDriver()
    {
        month M=new month();
        for (int i=0;i<31;i++)
        {
            day.incrementday();
        }
        Assert.assertEquals(2,day.getMonth());
        Assert.assertEquals(1,day.getDay());
    }
}