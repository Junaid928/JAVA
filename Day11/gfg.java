package Project15;
import java.util.*;
public class gfg {
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<>();
        ht.put("Vishal",10);
        ht.put("Sachin",30);
        ht.put("Vaibhav",20);
        System.out.println("Size of map is:- "+ht.size());
        System.out.println(ht);
        if(ht.containsKey("Vishal")){
            Integer a = ht.get("Vishal");
            System.out.println("Value for key is:- "+a);
        }
    }
}
