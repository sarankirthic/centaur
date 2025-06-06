import java.util.List;
import java.util.ArrayList;

class Time {
    private int hour;
    private int minute;
    private int second;

    static List<Time> times = new ArrayList<>();

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
}

public class Main {
}
