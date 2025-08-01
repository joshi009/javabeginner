package Practice;
import java.util.*;


public class Next_Greatest_Elements {
    public static void main(String[] args) {
        System.out.println();
    }
    public static ArrayList<Integer> nextGreaterElement(int arr[]) {
        // make a stack to store a number
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        //pop element smaller than or equal to arr[i]
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                list.add(-1);
            }else {
                list.add(stack.peek());
            }
            stack.push(i);
        }

        return list;

    }
}