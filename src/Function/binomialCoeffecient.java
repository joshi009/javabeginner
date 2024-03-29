package Function;

import java.util.Scanner;

public class binomialCoeffecient {
    public static void main(String[] args) {
     //we need to calculate
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("enter the value of r");
        int r=sc.nextInt();
        int BinomialCoefficient= fact(n)/(fact(r)*fact(n-r));
        System.out.println(BinomialCoefficient);

    }
    public static  int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*fact(n-1);
    }

}
