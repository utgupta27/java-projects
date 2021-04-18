package self;

enum Gender{
    FEMALE(1,"f"),
    MALE(2,"m"),
    UNDEFINED(3,"u");

    private final int index;
    private final String letter;

    Gender(int index,String letter){
        this.index = index;
        this.letter = letter;
    }
    int getIndex(){
        return index;
    }
    String getLetter(){
        return letter;
    }
}

enum WeakDays{
    MONDAY(1,"First Day"),
    TUESDAY(2,"Second Day"),
    WEDNESDAY(3,"Third Day"),
    THURSDAY(4,"Fourth Day"),
    FRIDAY(5,"Fifth Day"),
    SATURDAY(6,"Sixth Day"),
    SUNDAY(7,"Seveth Day");

    private final int dayNum;
    private final String nthday;

    WeakDays(int dayNum,String nthday){
        this.dayNum=dayNum;
        this.nthday=nthday;
    }
    int getDayNum(){
        return dayNum;
    }
    String getNthday(){
        return nthday;
    }
}

public class Enum1{
    public static void main(String[] args) {
        WeakDays w[] = WeakDays.values();
        for(int i=0; i< w.length ; i++) {
            System.out.println(w[i]+ " " + w[i].getDayNum() + " " + w[i].getNthday());
        }
    }

}