package Operators;

public class Logical {
    public static void main(String args[]) {
        //  ( Logical AND ) &&
        System.out.println((3 > 2) && (5 > 3));
        System.out.println((3 > 2) && (3 > 5));
        System.out.println((1 > 2) && (6 > 5));
        System.out.println((1 > 2) && (3 > 5));
        System.out.println("  ");


        // ( Logical OR ) ||
        System.out.println((3 > 2) || (5 > 3));
        System.out.println((3 > 2) || (3 > 5));
        System.out.println((1 > 2) || (6 > 5));
        System.out.println((1 > 2) || (3 > 5));
        System.out.println("  ");

        // ( Logical NOT ) !
        System.out.println(!(3 > 2));
        System.out.println(!(1 > 2));

    }
}
