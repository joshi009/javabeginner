package ArrayList;
import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList <Integer> list  = new ArrayList<>();
        ArrayList <Boolean> list2 = new ArrayList<>();
        ArrayList <String> list3 = new ArrayList<>();

        //Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2,8);
        System.out.println(list);

        // Get Operations
        int element = list.get(2);
        System.out.println(element);

        //delete element
        list.remove(1);
        System.out.println(list);

       // set
//        list.set(4,14);
//        System.out.println(list);

        //contain
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));

//        add
//        list.add(1 ,13);
//        System.out.println(list);
    }
}
