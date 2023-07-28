import java.util.ArrayList;
import java.util.List;

public class contains {
     public static void main(String[] args) {
       List<String> a1 = new ArrayList<String>();
       a1.add(0,"for");
       a1.add(1,"for");
       a1.add(2,"for");
       for(int i = 0; i<a1.size(); i++){
        System.out.println(a1.get(i)+" ");
       } 
       System.out.println();
       for(String str : a1)
         System.out.println(str+" ");
    }
}
