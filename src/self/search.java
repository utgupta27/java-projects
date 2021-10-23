package self;

import java.util.Scanner;

public class search {

    static boolean searchIndex(int[] arr, int key){
        boolean result = false;
        for (int j : arr) {
            if (j == key) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int size = input.nextInt();
        System.out.println("Enter the Elements of the array: ");
        int[] lst = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i+1) +" Element: " );
            lst[i] = input.nextInt();
        }
        System.out.println("Enter the Key Element: ");
        int key = input.nextInt();
        System.out.println(searchIndex(lst, key));
    }
}
