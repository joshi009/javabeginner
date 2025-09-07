package Pattern.PatternII;

public class H_Hollow_Rohmbus {
    public static void hollow_rohmbus(int n){
        //outer loop
        for(int i =1; i <= n; i++){
            //space
            for(int j = 1; j<= n-i; j++){
                System.out.print(" " + " ");
            }
            //hollow - Rectangle star
            for (int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*" + " ");
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rohmbus(6);
    }
}
