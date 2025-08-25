package Function;

public class L_Binary_To_Decimal {
    public static void binToDec(int binNum ){
        int myNum = binNum;
        int Pow  = 0;
        int decNum = 0;
        while (binNum>0){
            int lastDigit = binNum % 10;
            decNum =decNum + (lastDigit * (int)Math.pow(2,Pow));
            Pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(101);
    }
}
