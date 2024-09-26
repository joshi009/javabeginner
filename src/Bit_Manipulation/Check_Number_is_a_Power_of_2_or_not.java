package Bit_Manipulation;

public class Check_Number_is_a_Power_of_2_or_not {
    public static boolean isPowerofTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerofTwo(8));
    }
}
