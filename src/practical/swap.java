package practical;

import java.util.Scanner;

public class swap {
    private String str1,str2;

    public void setStr(String str1,String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public void display(){
        System.out.println("String 1: " + str1);
        System.out.println("String 1: " + str2);
    }

    public void swapString(){
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
    }

    public static void main(String[] args) {
        swap obj = new swap();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = input.next();
        System.out.print("Enter String 2: ");
        String str2 = input.next();
        obj.setStr(str1, str2);
        obj.swapString();
        obj.display();
    }
}
