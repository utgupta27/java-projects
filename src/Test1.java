public class Test1 {
    public static void main(String[] args) {
        int[] array = {1,0,2,9,3,8,4,7,5,6};
        array = Sorted.insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
