package Mst;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotateArr(arr,2);

        System.out.println(Arrays.toString(arr));
    }
    static void rotateArr(int arr[], int d) {
        // add your code here
        int ans[]=new int[arr.length];
         int k=0;
        for (int i = d; i < arr.length ; i++) {
            ans[k]=arr[i];
            k++;
        }
        for (int i = 0; i < d ; i++) {
            ans[k]=arr[i];
            k++;


        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=ans[i];

        }


    }
}