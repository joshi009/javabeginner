package Pattern;

import java.util.Scanner;

public class Half_Pyramid_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print");
        int n = sc.nextInt();
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
