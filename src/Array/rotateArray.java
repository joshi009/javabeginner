package Array;

import java.util.Arrays;

import static java.util.Collections.emptyListIterator;
import static java.util.Collections.rotate;

public class rotateArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        rotate(arr,7);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int arr[],int k)
    {   k=k%arr.length;
        for (int i = 0; i <k ; i++) {
            int temp=arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];

            }
            arr[arr.length-1]=temp;

        }
    }
}
