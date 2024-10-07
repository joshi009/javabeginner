package Bit_Manipulation;

public class Update_Ith_Bit {
    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return ClearIthBit(n,i);
        }else {
            return SetithBit(n,i);
        }
    }
    public static int ClearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int SetithBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10,2,1));
    }
}
