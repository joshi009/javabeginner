package TwoArray;

import java.util.Scanner;

public class Create_2D_Array {
    public static boolean search(int matrix[][],int  key){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("cell found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found ");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3;
        int m = 3;


        // take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,9);
    }
}
