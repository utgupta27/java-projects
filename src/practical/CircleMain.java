class Circle {
    int radius;
    int[] centre;
}
public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.centre = new int[]{4,5};
        circle.radius = 10;

        System.out.println("Radius: " + circle.radius);
        System.out.println("Centre: "+ "( "+circle.centre[0] + " , "+circle.centre[1]+" )");

    }
    
}
