package self;

import java.util.List;

public class ListOf extends Object {
    public static void main(String[] args) {
        List<String> lst = List.of("a","1","a","2","a","4");
        lst.forEach(item -> {
            if(item.equals("a")) {
                System.out.println("A");
            }
            else{
                System.out.println("Not A");
            }
        });
    }
}
