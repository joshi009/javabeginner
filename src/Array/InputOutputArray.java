
package Array;
import java.util.*;


public class InputOutputArray {
    public static void main(String[] args) {
        int[] marks= new int [3];
       // System.out.println("length of array = " + marks.length);

        Scanner sc = new Scanner(System.in);

        marks [0] = sc.nextInt();  //phy
        marks [1] = sc.nextInt();  //che
        marks [2] = sc.nextInt();  //math

        System.out.println("phy : " +marks[0]);
        System.out.println("che : " +marks[1]);
        System.out.println("math : " +marks[2]);

       // marks[2]=100;
       // System.out.println("che : " + marks[2]);

       // int percentage = (marks[0] + marks[1] + marks[2] ) /3;
       // System.out.println("percentage : " + percentage + "%");

    }
}

