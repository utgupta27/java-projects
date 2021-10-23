package code;

import java.util.*;

public class Que {
    public static void main(String[] args){
        Queue<Integer> que = new PriorityQueue<Integer>();
        que.add(9);
        que.add(7);
        que.add(2);
        que.add(1);
        que.add(4);
        que.add(6);
        que.add(5);
        int size = que.size();
        for( int i =0 ; i< size ; i++){
            // System.out.print(i + "");
            System.out.println( i +" : " + que.poll());
        }
        
        
        // System.out.println(que.peek());
        // System.out.println(que.peek());
        // for( Integer x : que){
        //     System.out.print(x + " ");
        // }
        
    }
}
