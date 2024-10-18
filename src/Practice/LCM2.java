package Practice;

import java.util.Scanner;

public class LCM2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

         int a = 3;
         int b = 6;
        int ans = (a > b) ? a : b;

        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        System.out.println("LCM of " + a + " and " + b
                + " : " + ans);
    }
}
