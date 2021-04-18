package self;

public class NumericDemo {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;

    public static void main(String... args) {
        NumericDemo nd = new NumericDemo();
        nd.b = 0b1100;
        System.out.println("Byte binary value: " + nd.b);
        nd.i = 42 ;     // decimal case
        nd.i = 045 ;    // octal case - base 8
        System.out.println("Int octal value: " + nd.i);
        nd.i = 0xcafe ; // hexadecimal case - base 16
        System.out.println("Int hexadecimal value: " + nd.i);
        nd.i = 0b10101010101010101010101010101011;
        System.out.println("Int binary value: " + nd.i);
        //Java 7 syntax
        nd.i = 0b1010_1010_1010_1010_1010_1010_1010_1011;
        System.out.println("Int binary value: " + nd.i);
        nd.l = 1000_000l; // equivalent to 1000_000L
        System.out.println("Long value: " + nd.l);
        nd.f =  5;
        System.out.println("Integer value assigned to a float variable: " + nd.f);
                nd.f =  2.5f; // equivalent to nd.f =2.5F;
        System.out.println("Decimal value assigned to a float variable: " + nd.f);
                nd.d =  2.5d; // equivalent to  nd.d =  2.5D;
        System.out.println("Decimal value assigned to a double variable: " + nd.f);
    }
}

