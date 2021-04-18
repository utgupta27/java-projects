package self;

import java.math.BigInteger;

//Similarly we can use the BigDecimal values too.
public class BigIntegerDemo {
    public static void main(String[] args) {
        java.math.BigInteger a = new java.math.BigInteger("81290274631434098702143043146721517834214612630120321870436032463784063274813245362087563174513280741082460132842764178520412018201682376027851035210874561324873321476312478354727389473102364786513278410724360178236412784261748157251551271596125");
        int c= 237242343;
        System.out.println(a.multiply(java.math.BigInteger.valueOf(c)));
    }
}
