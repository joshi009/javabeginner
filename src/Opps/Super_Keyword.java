package Opps;

public class Super_Keyword {

    public static void main(String[] args) {
        cow c = new cow();

    }
}

class Bull{
    Bull(){
        System.out.println("Bull is constructor is called");
    }
}
class cow extends Bull{
    cow () {
        super();
        System.out.println("cow constructor is called");
    }
}