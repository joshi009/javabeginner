package Strings;

public class Substring {
    public static String substring(String str,int si,int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        //Substring
        String str = "helloWorld";
        System.out.println(substring(str,0,5));
    }
}
