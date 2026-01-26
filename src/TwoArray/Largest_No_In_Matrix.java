package TwoArray;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_No_In_Matrix {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int largest = matrix[0][0];
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("largest element of matrix:" + largest);

    }
}
