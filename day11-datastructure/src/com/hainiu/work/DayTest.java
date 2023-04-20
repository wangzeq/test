package com.hainiu.work;

public class DayTest {
    private Day day;
    public DayTest(Day day){
        this.day=day;
    }
    public void printDayofweek(){
        switch (day){
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
            case SUNDAY:
                System.out.println("星期日");
                break;
        }
    }

    public static void main(String[] args) {
        DayTest daytest = new DayTest(Day.SATURDAY);
        daytest.printDayofweek();
    }

}
