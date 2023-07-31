package Project19;

public class Mythread1 implements Runnable{
    public void run(){
        System.out.println("The thread is running");
    }
}
class test3{
    public static void main(String[] args) {
        Runnable r1 = new Mythread1();
        Thread h1 = new Thread(r1, "My new thread");
        h1.start();
        String str = h1.getName();
        System.out.println(str);
    }
}
