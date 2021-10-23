package code;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
    public static void main(String[] args){
        ArrayList<String> arrLst = new ArrayList<String>();
        arrLst.add("Hello");
        arrLst.add("Utsav");
        arrLst.add("Sunil");
        arrLst.add("KDE");
        arrLst.add("Ubuntu");
        arrLst.add("Gnome");
        arrLst.add("XFCE");
        // for(String x : arrLst){
        //     System.out.println(x);
        // }
        Iterator iter =  arrLst.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
