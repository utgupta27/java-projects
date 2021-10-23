package code;

import java.util.Scanner;
public class PrefixSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt(), sum;
        int[] arr = new int[size];
        for(int i= 0 ; i < size; i++){
            arr[i] = input.nextInt();
        }       
        int[] res = new int[size];
        for(int i=0; i <  size ; i++){
            sum = 0;
            for(int j = 0 ; j <= i ; j++){
                sum+= arr[j];
            }
            res[i] = sum;
        }
        for(int i : res){
            System.out.print(i + " ");
        }
        input.close();
    }
}
