package Bit_Manipulation;

public class Odd_Even {
    // Least Significant Bit (LSB)  = 0 (Even)
    // LSB = 1 (Odd)
    // eg:  0 1 1
    //    & 0 0 1
    //      0 0 1
    public static void OddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            // even Number
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        OddorEven(3);
    }
}
