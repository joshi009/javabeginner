package ArrayList.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Lonely_ArrayList {
    public static ArrayList<Integer> lonely(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();

        if(list.get(1)-list.get(0)>1){
            ans.add(list.get(0));
        }
        if(list.get(list.size()-1)-list.get(list.size()-2)>1){
            ans.add(list.get(list.size()-1));
        }
        int i = 1;
        while (i + 1 < list.size()) {
            if (list.get(i) - list.get(i - 1) > 1 && list.get(i + 1) - list.get(i) > 1) {
                ans.add(list.get(i));
                i+=1;
            } else if (list.get(i + 1) - list.get(i) <= 1) {
                i += 2;

            } else {
                i += 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(15);
        list.add(20);
        list.add(8);
        System.out.println(lonely(list));

    }
    }

