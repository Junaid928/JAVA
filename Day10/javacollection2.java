package Project11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class javacollection2 {
    public static void main(String[] args) {
       List<String> a1 = new ArrayList<String>();
       a1.add(0,"Ravi");
       a1.add(1,"Vijay");
       a1.add(2,"Gaurav");
       a1.add(3,"Ajay");
       Iterator<String> itr = a1.iterator();
       while(itr.hasNext()){
        System.out.println(itr.next());
       }
       a1.set(1,"Rajesh");
       System.out.println(a1);
    }
}
