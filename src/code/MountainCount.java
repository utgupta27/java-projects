package code;

import java.util.Scanner;

public class MountainCount {
    public static void main(String[] args){
        Scanner input =  new Scanner( System.in);
        int size = input.nextInt(), level = 0, count =0;
        String str = input.next();
        for(int i = 0 ; i < size ; i++){
            if(str.charAt(i)=='U'){
                level ++;
            } else if(str.charAt(i) == 'D'){
                level--;
            }
            if(level > 1 || level < -1){
                count ++ ;
            }
        }
        System.out.print(count);
        input.close();
    }
}
