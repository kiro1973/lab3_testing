public class minute extends hour {
    static int minute=0;

    public static int getMinute() {
        return minute;
    }

    public minute()
    {

    }
    public static void incrementminute()
    {if (minute < 60) {
        ++minute;
    } else {
        incrementhour();
        minute = 0;
    }

    }

}
