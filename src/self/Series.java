package self;

public class Series {
    static int factorial(int num){
        if (num < 2) {
            return 1;
        }
        return num*factorial(num -1);
    }
    static int fibbonaccy(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return fibbonaccy(num-1) + fibbonaccy(num-2);
    }
    public static void main(String[] args) {
        System.out.println(factorial(30));
        System.out.println(fibbonaccy(30));
    }
}
