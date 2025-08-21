package Function;

public class H_Diff_Return_Type_Overloading {
    //fun to calculate int sum
    public static int sum(int a, int b){
        return a+b;
    }
    //fun to calculate float sum
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(8,2));
        System.out.println(sum(4.2f,5.8f));

    }
}
