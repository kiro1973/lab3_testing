import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
public class monthDriverTest  {
    @Test
    public void monthDriver()
    {
        month M=new month();
        for (int i=0;i<12;i++)
        {
            M.incrementmonth();
        }
        Assert.assertEquals(2001,M.getYear());
        Assert.assertEquals(1,M.getMonth());
    }

}