package tuting;

public class fib {
    public static void main(String[] args) {
        int a=0,b=1,c,n=2;
        if(n==1){
            System.out.print(a);
        }
        else{
            System.out.print(a+" "+b+" ");
            for (int i = 3; i < n; i++) {
                c=a+b;
                System.out.print(c + " ");
                a=b;
                b=c;
            }
        }
    }
}
