package Project18;

public class lambda2 {
    public static void main(String[] args) {
        SAYABLE s1 = (name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.SAY("Sonoo"));
        SAYABLE s2 = name ->{
            return "Hello, "+name;
        };
        System.out.println(s2.SAY("Sonoo"));
    }
}
