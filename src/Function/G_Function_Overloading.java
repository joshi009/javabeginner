package Function;

public class G_Function_Overloading {

    //find the sum of 2 numbers
    public static int Sum(int a, int b){
        return a+b;
    }

    //find the sum of 3 numbers
    public static int Sum(int a,int b, int c){

        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(Sum(4,5));
        System.out.println(Sum(3,3,3));
    }
}
