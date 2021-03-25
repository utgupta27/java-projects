import java.lang.Math;
public class Area {
    private static void calcArea(int side){
        System.out.println("The Area of Square is: " + side*side);
    }
    private static void calcArea(double radius){
        System.out.println("The Area of Circle is: " + Math.PI*radius*radius);
    }
    private static void calcArea(int length, int breadth){
        System.out.println("The Area of Circle is: " + length*breadth);
    }
    public static void main(String[] args) {
        Area.calcArea(5.7);
        Area.calcArea(4, 5);
        Area.calcArea(10);
    }
}
