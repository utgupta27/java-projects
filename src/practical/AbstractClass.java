package practical;

abstract class AbstractClass {
    abstract int noOfSides();
    abstract double area();
}

class Rectangle extends AbstractClass{
    private double length,breadth;
    Rectangle(){
        this.length=5.5;
        this.breadth=7.9;
    }
    protected int noOfSides(){
        return 4;
    }
    protected double area(){
        return length*breadth;
    }

    public void displayData(){
        System.out.println("No. of sides: "+noOfSides() + " Area: " + area());
    }
}

class Triangle extends AbstractClass{
    private double height,base;
    Triangle(){
        this.height=5.5;
        this.base=7.9;
    }
    protected int noOfSides(){
        return 3;
    }
    protected double area(){
        return height*base*0.5;
    }

    public void displayData(){
        System.out.println("No. of sides: "+noOfSides() + " Area: " + area());
    }
}


class DoCal {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle= new Triangle();
        rectangle.displayData();
        triangle.displayData();
    }
    
}

