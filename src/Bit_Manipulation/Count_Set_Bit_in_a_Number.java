package Bit_Manipulation;

public class Count_Set_Bit_in_a_Number {
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n&1) !=0){  //check our Lsb
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBit(15));  //16=1
    }
}
