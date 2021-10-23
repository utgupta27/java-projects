package self;

public class Strngs {
    public static void main(String[] args) {
        String[] arr =  new String[args.length];
//        for (int i = 0; i < args.length; i++) {
//            arr[i] = args[i];
//        }
        for (int i = args.length -1 ; i >= 0; i--) {
            for (int j = args[i].length() - 1; j >= 0 ; j--) {
                System.out.print(args[i].charAt(j));
            }
        }
    }
}
