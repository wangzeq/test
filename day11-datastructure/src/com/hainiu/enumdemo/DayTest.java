package com.hainiu.enumdemo;

/**
 * @author HaiNiu
 * @description
 */
public class DayTest {
    public static void main(String[] args) {

        // 直接使用枚举名.枚举项
        /*Day day = Day.FRIDAY;
        System.out.println(day);*/

        DayTest test = new DayTest(Day.MONDAY);
        test.test();

        System.out.println("---------");
        // 获取所有的枚举项
        Day[] values = Day.values();
        for (Day value : values) {
            System.out.println(value);
        }

        System.out.println("---------");

        Day monday = Day.valueOf("MONDAY");
        System.out.println(monday);

        System.out.println(Day.MONDAY.compareTo(Day.WEDNESDAY));

        System.out.println(Day.MONDAY.ordinal());


    }

    private Day day;

    public DayTest(Day day) {
        this.day = day;
    }

    public void test() {
        switch (day) {
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
}
