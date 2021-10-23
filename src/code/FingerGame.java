package code;

public class FingerGame {
    
    public static int getFinger(int num){
        int temp = 0, count =1;
        if(num <= 5){
            return num;
        }
        while(num > temp){
            temp = 5 + (count-1)*4;
            count++;
        }   
        // System.out.println(temp + " - " + count);
        if((count-1) %2 == 0){
            return temp - num +1;
        } else {
            return 5 - (temp - num) ;
        }
    }
    public static void main(String[] args){
        for (int i = 0; i < 37; i++) {
            System.out.println(i + " -> " +getFinger(i));
        }
        
    }
}
