package self;

public class Utf8charset {
    public static void main(String[] args) {
        for (int i = 0; i < 65536; i++) {
            if(i%50 == 0){
                System.out.println();
            }
            System.out.print((char)i + " ");
        }
    }
}
