package code;

public class Uniq {
    static int[] uniqueEle(int[] arr){
        int[] temp = new int[arr.length];
        int k = 0, count,j;
        for(int i =0 ; i < arr.length; i ++){
            count = 0;
            for(j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                temp[k] = arr[i];
                k++;
            }
        }
        int[] res = new int[k];
        for(int i = 0; i < k ; i++){
            res[i] = temp[i];
        }
        return res;
    }

    static int[] count(int[] arr, int[] uniqEle){
        int[] temp = new int [uniqEle.length];
         for(int i = 0; i < uniqEle.length ; i++){
             int count = 0;
            for(int j =0; j < arr.length ; j++){
                if(uniqEle[i] == arr[j]){
                    count++;
                }
            }
            temp[i] = count;
        }
         return temp;
    }


    public static void main(String[] args){
        int[] data = {0,1,2,1,7,8,8,1,2,6,5,8,9,4,5,5,4,9};
        int[] res = uniqueEle(data);
        int[] cnt = count(data,res);

        for(int i = 0; i < res.length;  i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < cnt.length;  i++){
            System.out.print(cnt[i] + " ");
        }
    }
}
