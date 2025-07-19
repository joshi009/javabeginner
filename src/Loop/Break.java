package Loop;

public class Break {
    public static void main(String[] args) {
        int n = 0;
        for( n = 1; n <= 10; n++){
            if(n == 3){
                break;
            }
            System.out.println(n);
        }
        System.out.println("I am out from the loop.");
    }
}
