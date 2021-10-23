package self;

public class reverse {
    public static void main(String[] args) {
        int temp = Integer.parseInt(args[0]), rem, res =0 ;
        while (temp != 0){
            rem = temp % 10;
            res = res*10 + rem;
            temp/=10;
        }
        System.out.println(res);
    }
}
