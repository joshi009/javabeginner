package ArrayList.Practice;

import java.util.ArrayList;

public class Monotonic_ArrayList {
    public static boolean isMonotonic(ArrayList<Integer>  nums){
        boolean increasing = true;
        boolean decreasing = true;

        for(int i=1; i<nums.size(); i++){
            if(nums.get(i) > nums.get(i-1)){
                decreasing = false;
            }
            if(nums.get(i) < nums.get(i-1)){
                increasing = false;
            }
        }
        return increasing || decreasing;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(isMonotonic(list));
    }
}
