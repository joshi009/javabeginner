package Bit_Manipulation;

public class Set_ith_Bit {
    public static int SetithBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(SetithBit(10,2));
    }
}
