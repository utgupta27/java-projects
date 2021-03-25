public class ThisKeyWord {
    public static void main(String[] args) { 
        Example example = new Example(20, 30);
        System.out.println(example.x + " " + example.y);
    }
}
    
class Example {
    int x; 
    int y;
    Example(int x) { 
        this.x = x; 
        this.y = 10;
    }
    Example(int x, int y) {
        this(x); this.y = y;
    }
}