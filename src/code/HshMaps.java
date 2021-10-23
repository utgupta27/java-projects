package code;

import java.util.HashMap;

public class HshMaps {

    public static void main(String[] args){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(1, 20);
        hm.put(2, 23);
        hm.put(3, 67);
        hm.put(6, 87);
        hm.put(4, 34);
        hm.put(5, 83);
        hm.put(7, 47);
        System.out.println(hm.values());
    }
}
