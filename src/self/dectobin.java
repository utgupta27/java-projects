package self;

public class dectobin {
    public static void main(String[] args) {
        int rem = 0,res = 0;
        int temp = Integer.parseInt(args[0]);
        while(temp != 0){
            rem = temp%2;
            res = res*10 + rem;
//            System.out.println(rem);
            temp/=2;
        }
        System.out.println(res);
    }
}
