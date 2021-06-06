package practical;

import java.util.Scanner;

public class MultMatrix {
    public static void main(String[] args) {
        int m,n=1,m1=1,n1;
        Scanner input = new Scanner(System.in);
        do{ 
            if (n != m1) {   
                System.out.println("Wrong Dimensions. Matrix Cannot be Multiplied\nRe-Enter the Dimensions Again...");
                System.out.println("NOTE: The Column Number of First Matrix must be same as the Row of Second Matrix.\n");
            }
            System.out.print("Matrix1 -> Enter the number of Rows & Columns: ");
            m = input.nextInt();
            n = input.nextInt();
            System.out.print("Matrix2 -> Enter the number of Rows & Columns: ");
            m1 = input.nextInt();
            n1 = input.nextInt();
        }while (n != m1); 

        int[][] matrix1,matrix2; 
        matrix1 = new  int[m][n];
        matrix2 = new int[m1][n1];
        System.out.println("Enter the Elements 1st Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter "+"( "+ i +" , "+ j +" )"+"th Element :");
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the Elements 1st Matrix: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print("Enter "+"( "+ i +" , "+ j +" )"+"th Element :");
                matrix2[i][j] = input.nextInt();
            }
        }
        int[][] resultanMatrix = new int[m][n1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n1; j++) {
                resultanMatrix[i][j]=0;
                for (int k = 0; k < m1; k++) {
                    resultanMatrix[i][j] += matrix1[i][k]*matrix2[k][i];
                }
            }
        }
        System.out.println("Product of Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(resultanMatrix[i][j] + "  ");
            }
            System.out.println();
        }
        input.close();
    }
}
