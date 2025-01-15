package Pattern.practiceset;

import java.util.Scanner;

public class Inverted_Half_Pyramid_Num {

        public static void main(String[] args) {
            int n ;
            System.out.println("Enter the number of line");
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();


            for (int i = rows; i >= 1; --i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

