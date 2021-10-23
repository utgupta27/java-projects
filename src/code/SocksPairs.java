package code;

import java.util.Scanner;

class SocksPair{

    public static void sort(int size,int[] ar){
        for(int i =0; i  < size ; i++){
            for(int j =0 ; j < size ; j++){
                if(ar[i] < ar[j]){
                    int temp = ar[i];
                    ar[i] =  ar[j];
                    ar[j] = temp;
                }
            }
        }
    } 
    public static int countPairs(int size, int[] ar){
        int count,k=0;
        sort(size, ar);
        int[] uniq = new int[size];
        for(int i = 0; i < size ;i ++){
            count = 0;
            for(int j=i; j< size ; j++){
                if(ar[i] == ar[j]){
                    count ++;
                }
            }
            if(count == 1){
                uniq[k] = ar[i];
                k++;
            }
        }
        int[] freq = new int[k];
        for(int i = 0 ; i< k ; i++){
            count =0;
            for(int j = 0; j < size ; j++){
                if(uniq[i] == ar[j]){
                    count++;
                }
            }
            freq[i] = count;
        }
        int result =0;
        for(int i =0 ; i < k; i++){
            result+= freq[i]/2;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] ar = new int[size];
        for(int i= 0; i < size ; i++){
            ar[i] = input.nextInt();
        }
        System.out.print(countPairs(size, ar));
    }
}