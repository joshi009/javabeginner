package Recursion;

public class Array_Sorted {
    public static boolean isShorted(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isShorted(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(isShorted(arr,0));
    }
}
