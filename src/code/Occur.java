package code;

import java.util.Scanner;

public class Occur {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineNo = input.nextInt();
        String word;
        word = input.next();
        input.nextLine();
        String[] paras = new String[lineNo];
        for (int i = 0; i < lineNo; i++) {
            paras[i] = input.nextLine();
        }
        String[] temp = paras.clone();
        int count;
        int[] freq = new int[lineNo];
        for (int i = 0; i < lineNo; i++) {
            count = 0;
            while (temp[i].contains(word) == true) {
                int indx = temp[i].indexOf(word);
                count++;
                temp[i] = temp[i].substring(indx + word.length() -1);
            }
            freq[i] = count;
        }
        temp = paras.clone();
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq.length - i -1; j++) {
                if (freq[i] > freq[j]) {
                    int tmp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = tmp;
                    String str = temp[i];
                    temp[i]= temp[j];
                    temp[j] = str;
                }
            }
        }
        for (int i = temp.length - 1;  i >= 0; i--) {
                System.out.println(temp[i]);
        }

    }
}
