package code;

import java.util.Map;
import java.util.HashMap;

public class Fibbonacci {
    
    private Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

    public int fibbo(int num){

        if( hm.containsKey(num) ){
            return hm.get(num);
        }
        if(num <= 2){
            return 1; 
        }
        hm.put(num, fibbo(num-1) + fibbo(num-2));
        return hm.get(num);
    }
    
    public static void main(String[] args){
        Fibbonacci obj =  new Fibbonacci();
        System.out.println(obj.fibbo(45));
    }
}
