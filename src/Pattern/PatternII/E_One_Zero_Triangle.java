package Pattern.PatternII;

public class E_One_Zero_Triangle {
    public static void One_Zero_Triangle(int n){
//        int count = 1;
        //outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=i; j++){
                //check for even
                if( (i+j) % 2 == 0){
                    System.out.print("1" + " ");
//                    System.out.print(count+" ");
//                    count++;
                }else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        One_Zero_Triangle(6);
    }
}
