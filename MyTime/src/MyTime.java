class MyTime {
    private int hour;
    private int minute;
    private int second;

    MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public MyTime nextSecond() {
        previousSecond();
        if (this.second == 60) {
            this.second = 0;
            this.nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        this.minute++;
        if (this.minute == 60) {
            this.minute = 0;
            this.nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        this.hour++;
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        this.second--;
        if (this.second == 0) {
            this.second = 59;

        }
        return this;
    }
}
