package Bit_Manipulation;

public class Get_Ith_Bit {
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }


    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
    }
}