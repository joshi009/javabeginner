package Recursion;

public class incre {
    public static void inc(int i,int n){
        //base case
        if(i==n){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        inc(i+1,n);
    }
    public static int sumnatural(int n)
    {   if(n==1)
    {
        return 1;
    }
        return n+sumnatural(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        int i=1;
        //inc(1,n);
        System.out.println(sumnatural(5));
    }
}
