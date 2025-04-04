package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list);  //Ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); //descending order
        System.out.println(list);
    }
}
