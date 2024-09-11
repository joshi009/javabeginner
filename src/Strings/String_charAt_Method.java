package Strings;

public class String_charAt_Method {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "Hello";
        String lastName = "World";
        String fullName = firstName + " " + lastName;
        printLetters(fullName);
    }
}
