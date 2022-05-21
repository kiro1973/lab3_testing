public class month extends year{
    static int month=1;
    public month()
    {

    }

    public static int getMonth() {
        return month;
    }

    public static void incrementmonth()
    {
        if (month < 12) {
            ++month;
        } else {
            incrementYear();
            month = 1;
        }
    }

}
