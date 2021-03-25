import java.util.Scanner;

public class Sorted {

    // insertionSort method takes an integer array and sort it using insertion sort algorithm
    // and returns the sorted array in increasing order.
    static int[] insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i > -1 && key < array[i]) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        return array;
    }

    // reverseInsertionSort method takes an integer array and sort it using insertion sort algorithm
    // and returns the sorted array in decreasing order.
    static int[] reverseInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int key = array[i];
            while (j > -1 && key > array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }

    //Main function tests the sorted member function with manual input from the user
    //Only for testing purposes
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = input.nextInt();
        System.out.println("Input the Array element : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("The Array before sorting is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("The Sorted array is : ");
        int[] sortedArray = reverseInsertionSort(array);
        for (int i = 0; i < size; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        input.close();
    }
}
