package WEEK_10.APP_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInfo {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    public DateInfo(int year, int month, int day, int hour, int minute){
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    //getters
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void returnDate(){
        Date date = new Date(year - 1900, month - 1, day, hour, minute);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, MMM d, yyyy");

        System.out.println("Formatted Date 1: " + simpleDateFormat1.format(date));
        System.out.println("Formatted Date 2: " + simpleDateFormat2.format(date));

    }
}