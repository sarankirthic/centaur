import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(dateFormat);
    }
}

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(31, 7, 2001);
        System.out.println(date1);
    }
}
