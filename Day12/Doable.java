package Project17;

interface Doable  {
    default void doIt(){
        System.out.println("Do it now");
    }
}
