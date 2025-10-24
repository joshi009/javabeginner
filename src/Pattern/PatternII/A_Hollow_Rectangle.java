package Pattern.PatternII;

public class A_Hollow_Rectangle {
    public static void hollow_Rectangle(int totRow, int totCol){
        //outer loop
        for(int i =1 ; i <= totRow; i++){
            //inner- column
            for(int j=1; j <= totCol;j++){
                // cell(i,j)
                if(i == 1 || i == totRow || j == 1 || j == totCol){
                    //boundary cell
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        hollow_Rectangle(4,5);
    }
}
