package Bit_Manipulation;

public class Clear_Last_Ith_Bit {
    public static int clearIthBits(int n , int i){
        int bitMask = (~0)<<i;
        return  n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBits(15,2));
    }
}
