package ArrayList.Practice;
import java.util.*;
public class mostfrq {
    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null; // Return null if the value is not found
    }
    public static int  count(HashMap<Integer,Integer> hm,int key, int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key && i<arr.length-1){
//                 hm.put(arr[i+1],hm.getOrDefault(i+1,0)+1);
                if(hm.containsKey(arr[i+1])){
                    hm.put(arr[i+1],hm.get(arr[i+1]+1));
                }
                else{
                    hm.put(arr[i+1],1);
                }
                 max=Math.max(max,hm.get(i+1));
            }
        }
   return getKeyByValue(hm,max);
    }
    public static void main(String[] args) {
        int []arr={1,100,40,60,1,200,1,100,1,100,1,100};
        int key=1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        System.out.println(count(hm,key,arr));
    }
}
