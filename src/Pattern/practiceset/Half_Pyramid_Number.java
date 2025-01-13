package Pattern.practiceset;

import java.util.Scanner;

public class Half_Pyramid_Number {

        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of lines");
            int rows = sc.nextInt();


            for (int i = 1; i <= rows; ++i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

