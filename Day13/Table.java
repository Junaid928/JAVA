package Project19;

public class Table {
    void printTable(int n){
        for(int i = 1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Mythread2 extends Thread{
    Table t;
    Mythread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}
class Mythread3 extends Thread{
    Table t;
    Mythread3(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}
class Synchronised{
    public static void main(String[] args) {
        Table obj = new Table();
        Mythread2 t1 = new Mythread2(obj);
        t1.start();
        Mythread3 t2 = new Mythread3(obj);
        t2.start();
    }
}
