package org.example.jan.java_250120.ch05;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();
        Week week = Week.MONDAY;
        int dayOfWeek = Calendar.DAY_OF_WEEK;

        switch(dayOfWeek){
            case 1: week = Week.SUNDAY; break;
            case 2: week = Week.MONDAY; break;
            case 3: week = Week.TUESDAY; break;
            case 4: week = Week.WEDNESDAY; break;
            case 5: week = Week.THURSDAY; break;
            case 6: week = Week.FRIDAY; break;
            case 7: week = Week.SATURDAY; break;
        }
        System.out.println("dayOfWeek = " + dayOfWeek);
        System.out.println("week = " + week);
        if(week == Week.WEDNESDAY){
            System.out.println("수요일");
        }


    }
}
