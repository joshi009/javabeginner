package Pattern.practiceset;

import java.util.Scanner;

public class Floyds_Triangle {

        public static void main(String[] args) {
            int n, number = 1;
            System.out.println("Enter the number of line");
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();

            for(int i = 1; i <= rows; i++) {

                for(int j = 1; j <= i; j++) {
                    System.out.print(number + " ");
                    ++number;
                }

                System.out.println();
            }
        }
    }

