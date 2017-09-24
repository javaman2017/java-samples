package controlflow;

import classes.enums.Days;

public class ScheduleUtils {
    
    /**
     * Returns true if Days.day is a weekday and false 
     * otherwise
     */
    static boolean isWeekday(Days day){
        if (day.equals(Days.MON)){
            return true;
        } else if (day.equals(Days.TUES)){
            return true;
        } else if (day.equals(Days.WED)){
            return true;
        } else if (day.equals(Days.THUR)){
            return true;
        } else if (day.equals(Days.FRI)){
            return true;
        } else {
            return false;
        }    
    }

    public static void main(String[] args) {
       System.out.println("Thur is a weekday: " + ScheduleUtils.isWeekday(Days.THUR));
       System.out.println("Sat is a weekday: " + ScheduleUtils.isWeekday(Days.SAT));
    }
}
