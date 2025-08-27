package Function;

public class N_Method_Of_Scope {
    public static void prints(){
        //it  is also scope method because s is not define here
//        System.out.println(s);
    }
    public static void main(String[] args) {
        //scope is a variable which is used to initialise the method
        // s is not define above the line
//        System.out.println(s);   //this is scope
        int s = 5;
        System.out.println(s);
    }
}
