package Project15;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting: "+x);
        arr[++top] = x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack empty");
            System.exit(1);
        }
        return arr[top--];
    }
    public int getSize(){
        return top + 1;
    }
}
