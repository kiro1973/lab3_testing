public class hour extends day{
    static int hour=0;
    public hour()
    {

    }

    public static int getHour() {
        return hour;
    }

    public static void incrementhour()
    {
        if (hour < 24) {
            ++hour;
        } else {
            incrementday();
            hour = 0;
        }
    }

}
