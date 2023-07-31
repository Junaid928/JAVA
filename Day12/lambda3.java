package Project18;

public class lambda3 {
    public static void main(String[] args) {
        adder a1 = (a,b)->{
            return "Sum: "+(a+b);
        };
        System.out.println(a1.call(10,12));
        multiply m1 = (m,u)->{
            return "Product: "+(m*u);
        };
        System.out.println(m1.call(5,6));
    }
}
