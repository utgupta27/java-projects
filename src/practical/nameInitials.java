package practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nameInitials {
    private String fullName;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    void initials(){
        StringBuilder init = new StringBuilder();
        List<String> list= new ArrayList<>();
        for (int i = 0; i < fullName.length(); i++) {
            if(fullName.charAt(i) != ' '){
                init.append(fullName.charAt(i));
            }
            else if (fullName.charAt(i) == ' ') {
                list.add(init.toString());
                init = new StringBuilder();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size()-1){
                System.out.print(list.get(i).toUpperCase().charAt(0));
            }
            else {
                System.out.println(" "+list.get(i).substring(0,1).toUpperCase() + list.get(i).substring(1));
            }
        }
    }

    public static void main(String[] args) {
        nameInitials obj = new nameInitials();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Full-Name: ");
        obj.setFullName(input.nextLine() + " ");
        obj.initials();
    }
}
