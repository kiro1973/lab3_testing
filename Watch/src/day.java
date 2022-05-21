public class day extends month{
    static int day=1;

    public static int getDay() {
        return day;
    }

    public day()
    {

    }
    public static void incrementday()
    {
        if (day < 31) {
            ++day;
        } else {
            incrementmonth();
            day = 1;
        }
    }

}
