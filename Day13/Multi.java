package Project19;

public class Multi extends Thread {
    public void run(){
        System.out.println("Thread1 is running");
    }
}
class Multi2 extends Thread {
    public void run(){
        System.out.println("Thread2 is running");
    }
}
class mt{
    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();
        Multi2 t2 = new Multi2();
        t2.start(); 
    }
}
