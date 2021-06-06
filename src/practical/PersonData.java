package practical;

import java.util.Scanner;
class Person {
    private String name;
    private int age;
    private double salary;
    protected void getdata(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name = input.nextLine();
        System.out.print("Enter your Age: ");
        age = input.nextInt();
        System.out.print("Enter Your Salary: ");
        salary = input.nextDouble();
        input.close();
    }
    protected void displayData(){
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Salary: "+ salary);
    }
}

class Main{
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.getdata();

        person1.displayData();

    }
}