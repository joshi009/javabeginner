package Pattern.practiceset;

import java.util.Scanner;

public class Inverted_Left_Half_Pyramid {
        public static void main(String[] args)
        {

            // Number of rows
            int x;
            System.out.println("Enter the numbers of lines");
            Scanner sc = new Scanner(System.in);
            int  N = sc.nextInt();

            // Outer loop runs N times, once for each row
            for (int i = 1; i <= N; i++) {
                // Inner loop prints 'i - 1' spaces
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("  ");
                }

                // Inner loop prints 'N - i + 1' stars
                for (int j = 1; j <= N - i + 1; j++) {
                    System.out.print("*" +" ");
                }
                // Move to the next line
                System.out.println();
            }
        }
    }
