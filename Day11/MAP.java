package Project14;
import java.util.*;

public class MAP {
    public static void main(String[] args) {
        Map<Integer,city> m = new HashMap<Integer,city>();
        city c1 = new city(10,"Washington D.C.","USA");
        city c2 = new city(12,"London","UK");
        city c3 = new city(13,"New Delhi","India");
        m.put(1,c1);
        m.put(2,c2);
        m.put(3,c3);
        for(Map.Entry<Integer,city> entry:m.entrySet()){
            int key = entry.getKey();
            city c = entry.getValue();
            System.out.println(key+" Details");
            System.out.println(c.sno+" "+c.city+" "+c.country);
        }
    }
}
