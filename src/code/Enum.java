package code;

public class Enum{
    enum WeekDay{
        SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURASDAY(4), FRIDAY(5), SATURDAY(6);
        int index;
        WeekDay(int index){
            this.index = index;
        }
        int getIndex(){
            return this.index;
        }
    }
    public static void main(String[] args){
        // WeekDay[] week = WeekDay.values();
        // for(WeekDay x: week){
        //     System.out.println(x + "  " + x.getIndex());
        // }
        WeekDay day = WeekDay.FRIDAY;
        System.out.println(day.getIndex());
    }

}
