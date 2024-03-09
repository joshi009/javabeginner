import java.util.Scanner;

public class Area {
    public static void main(String args [] ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        float rad = sc.nextFloat();
//        float area = 3.14f * rad * rad;
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
