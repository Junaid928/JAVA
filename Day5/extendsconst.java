import java.util.Scanner;
class emp {
    float salary=100000;
}
class prog extends emp{
    int bonus=50000;
    public static void main(String[] args) {
        prog p = new prog();
        System.out.println("Programmer salary is: "+p.salary);
        System.out.println("Bonus of Programmer is: "+p.bonus);
      
    }
}
