package Function;

import java.util.Scanner;

public class B_Syntax_With_Parameter {

    //first function
    public static void calculateSum(int num1,int num2){
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }

    //second function
    public static int calSum(int a,int b){  // a & b is parameter and formal parameter
        int Sum = a + b;
        return Sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        // first function process
        int Sum = a + b;
        calculateSum(a,b);  // a & b is argument or actual parameter

        // second function process
//        int Sum = calSum(a,b);     // a & b is argument or actual parameter
//        System.out.println("Sum is : " + Sum);

    }
}
