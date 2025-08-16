package Function;

public class C_Call_By_Value {

    public static void Swap(int a, int b){

        //swap
        int temp = a;
         a = b;
         b = temp;
        System.out.println("a : " + a);   //copy of a which is inside main function known as call by value
        System.out.println("b : " + b);
//        In java function is always call by value.
    }
    public static void main(String[] args) {

        //swap value exchange
        int a = 5;
        int b = 10;
        Swap(a,b);

        // call by reference

//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
    }
}
