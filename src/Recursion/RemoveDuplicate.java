package Recursion;

public class RemoveDuplicate {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
//        base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

//        kaam
        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){

//            duplicate
            removeDuplicate(str,idx+1,newStr,map);
        }else {
            map[currchar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currchar),map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str,0,new StringBuilder(" "),new boolean[26]);
    }
}
