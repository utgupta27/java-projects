package code;

import java.util.LinkedList;

public class LnkList {
    public static void main(String[] args){
        LinkedList<String> lnkLst = new LinkedList<String>();
        lnkLst.add("Hello");
        lnkLst.add("Utsav");
        lnkLst.add("Sunil");
        lnkLst.add("KDE");
        lnkLst.add("Ubuntu");
        lnkLst.add("Gnome");
        lnkLst.add("XFCE");
        for(String x : lnkLst){
            System.out.println(x);
        }
        
    }
}
