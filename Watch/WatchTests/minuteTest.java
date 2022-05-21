import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class minuteTest  {
    @Test
    public void minuteDriver()
    {
        month M=new month();
        for (int i=0;i<=60;i++)
        {
            minute.incrementminute();
        }
        Assert.assertEquals(1,minute.getHour());
        Assert.assertEquals(0,minute.getMinute());
    }

}