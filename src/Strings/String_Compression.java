package Strings;

public class String_Compression {
    public static String compression(String str){
        String newsstr= " ";
        // aaaa
        for(int i=0; i<str.length(); i++){
            Integer Count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                 Count++;
                 i++;
            }
            newsstr += str.charAt(i);
            if(Count>1){
                newsstr += Count.toString();
            }
        }
        return newsstr;
    }

    public static void main(String[] args) {
        String str = "aaaabbbbccccccd";
        System.out.println(compression(str));
    }
}
