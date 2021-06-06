package practical;

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        int m,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        m = input.nextInt();
        System.out.print("Enter the number of columns: ");
        n = input.nextInt();
        int[][] matrix1,matrix2; 
        matrix1 = new  int[m][n];
        matrix2 = new int[m][n];
        System.out.println("Enter the Elements 1st Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter "+"( "+ i +" , "+ j +" )"+"th Element :");
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the Elements 1st Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter "+"( "+ i +" , "+ j +" )"+"th Element :");
                matrix2[i][j] = input.nextInt();
            }
        }
        System.out.println("Sum of Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix1[i][j] + matrix2[i][j] + "  ");
            }
            System.out.println();
        }

        input.close();

    }
}
