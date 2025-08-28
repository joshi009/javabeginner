package Function;

public class O_Block_Scope {
    public static void main(String[] args) {
        {
            int p = 18;
            System.out.println(p);//this is called block scope
        }
//        System.out.println(p);//not block scope
    }
}
