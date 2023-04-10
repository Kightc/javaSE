package edu.usts.kight.kight07_object.equals.exer2;

import java.util.Objects;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/7 15:15
 * @Version 1.0
 */
public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(){

    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }


}
