package controlflow;

import classes.enums.Days;

public class ScheduleUtils {
    
    /**
     * Returns true if Days.day is a weekday and false 
     * otherwise
     */
    static boolean isWeekday(Days day){
        switch(day){
        case MON: case TUES: case WED: case THUR: case FRI:
            return true;
        default:
            return false; // day is SAT or SUN
        }
    }

    public static void main(String[] args) {
       System.out.println("Thur is a weekday: " + ScheduleUtils.isWeekday(Days.THUR));
       System.out.println("Sat is a weekday: " + ScheduleUtils.isWeekday(Days.SAT));
    }
}
