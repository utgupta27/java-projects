//package self;
//
//public class solution {
//    static void uniq(int[] arr){
//        int count = 0, k=0;
//        int[] temp = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            count = 0;
//            for (int j = 0; j <= i; j++) {
//                if(arr[i] == arr[j]){
//                    count ++;
//                }
//            }
//            if( count == 1){
//                temp[k] = arr[i];
//                k++;
//            }
//        }
//        for (int i = 0; i < k; i++) {
//            System.out.println(temp[i]);
//        }
//    }
//    static void count(int[] arr, int[] uniq){
//        int count = 0;
//        for (int i = 0; i < uniq.length; i++) {
//            count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if ( uniq[i] == arr[j]){
//                    count++;
//                }
//            }
//            System.out.println(count + " ");
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {2,3,4,4,5,5,5,5,2,3,3};
//        int[] uni = new int[arr.length];
//        uni = uniq(arr);
//    }
//}
