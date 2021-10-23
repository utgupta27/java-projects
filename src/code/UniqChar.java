package code;

import java.util.Scanner;

public class UniqChar {
    
    public static char[] rex(char[] data){
        int k= 0, count;
        char[] uniq = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            count = 0;
            for (int j = 0; j < i+1; j++) {
                if(data[i] == data[j]){
                    count++;
                }
            }
            if(count == 1){
                uniq[k] = data[i];
                k++;
            }
        }
        char[] res = new char[k];
        for (int i = 0; i < k; i++) {
            res[i] = uniq[i];
        }
        return res;
    }

    public static int[] countEle(char[] data, char[] uniq){
        int count;
        int[] cnt = new int[uniq.length];
        for (int i = 0; i < uniq.length; i++) {
            count =0;
            for(int j =0 ; j < data.length; j++){
                if(uniq[i]== data[j]){
                    count ++;
                }
            }
            cnt[i] = count;
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String data = input.nextLine();
        // char[] str = {'a','a','a','w','w','i','i','i','i'};
        char[] str = new char[data.length()];
        for (int i = 0; i < data.length(); i++) {
            str[i] = data.charAt(i);
        }
        char[] uniqEle = rex(str);
        int[] count = countEle(str, uniqEle);
        for (int i = 0; i < uniqEle.length; i++) {
            System.out.print(uniqEle[i]+""+count[i]);
        }
        input.close();
    }
}
