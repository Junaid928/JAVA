package Project19;

public class Multi3 implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }
}
class test2{
    public static void main(String[] args) {
        Multi3 m1 = new Multi3();
        Thread t1 = new Thread(m1);
        //Thread(Runnable r)
        t1.start();
    }
}