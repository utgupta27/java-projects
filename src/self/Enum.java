package self;

class EnumData{
    enum Days{
        MONDAY("Okay"),TUESDAY("Good"),WEDNESDAY("Very Good"),THURASDAY("Awesome"),FRIDAY("Amazing"),SATURDAY("Wonderfull"),SUNDAY("Excellent");
        private String number;
        private Days(String number){
            this.number = number;
        }
        public String getNumber(){
            return this.number;
        }
    }
    enum Months{
        JANUARY("31 Days"),FEBRUARY("28 Days"),MARCH("31 Days"),APRIL("30 Days"),MAY("31 Days"),JUNE("30 Days"),JULY("31 Days"),AUGUST("31 Days"),SEPTEMBER("30 Days"),OCTOBER("31 Days"),NOVEMBER("30 Days"),DECEMBER("31 Days");
        private String dayDetails;
        private Months(String dayDetails){
            this.dayDetails=dayDetails;
        }
        public String getdayDetails(){
            return this.dayDetails;
        }
    }
    enum Colors{
        RED(1),YELLOW(2),BLUE(3),GREEN(4),WHITE(5),BLACK(6),PURPLE(7),GREY(8),ORANGE(9),PINK(10),BROWN(11),VOILET(12),INDIGO(13);
        private int index;
        private Colors(int index){
            this.index=index;
        }
        public int getColorIndex() {
            return this.index;
        }
    }
}

class Enum extends EnumData{
    public static void main(String[] args) {
        Colors arr[] = Colors.values();
        for(Colors x: arr){
            System.out.println(x.ordinal() + " -> "  +  x.name() + " -> " + x.getColorIndex());
        }
    }
}

class EnumTest1 extends EnumData{
    public static void main(String[] args) {
        Months arr[] = Months.values();
        for(Months x : arr){
            System.out.println(x.name() + " has " + x.getdayDetails());
        }
    }
}

class EnumTest2 extends EnumData{
    public static void main(String[] args) {
        Days arr[] = Days.values();
        for(Days x : arr){
            System.out.print(x.ordinal() + " -> ");
            System.out.println(x.name() + " -> " + x.getNumber());
        }
    }
}