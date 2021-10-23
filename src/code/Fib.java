package code;

public class Fib {
     protected static int fibbo(int num){
         if(num <= 2){
             return 1;
         }
         return fibbo(num-1) + fibbo(num -2);
     }

     protected static int fib(int num){
         int a=0;
         int b=1, c = 0;
         if(num <1){
             return a;
         }
         if(num == 1){
             return b;
         }
         for(int i = 2; i<=num ; i++){
             c= a+b;
             a = b;
             b =c;
         }
         return c;
     }

    public static void main(String[] args){
        System.out.println(fib(6));
    }
}