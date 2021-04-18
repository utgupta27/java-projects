package self;

//java JVM implicitly import and extend all the classes with Object.
import java.lang.Object;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class StaticImport extends Object{
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(sqrt(93));
    }
}
