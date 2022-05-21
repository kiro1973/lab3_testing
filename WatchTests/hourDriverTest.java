import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
public class hourDriverTest  {
    @Test
    public void dayDriver()
    {
        month M=new month();
        for (int i=0;i<=24;i++)
        {
            hour.incrementhour();
        }
        Assert.assertEquals(2,hour.getDay());
        Assert.assertEquals(0,hour.getHour());
    }
}