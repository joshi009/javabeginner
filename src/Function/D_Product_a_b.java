package Function;

public class D_Product_a_b {
    public static int  product(int a , int b){
         int multiply = a*b;
         return multiply;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int prod = product(a,b);
        System.out.println(prod);
        System.out.println(product(7,8));
        prod = product(3,9);
        System.out.println(prod);
    }
}
