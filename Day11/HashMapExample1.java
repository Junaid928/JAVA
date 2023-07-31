package Project12;

import java.util.*;  

public class HashMapExample1{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();   
   map.put(1,"Mango");    
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes");       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
   map.put(4,"Grapes");
   System.out.println("Iterating Hashmap...");
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
   map.putIfAbsent(103,"Gaurav");
   System.out.println("Iterating Hashmap...");
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }
   HashMap<Integer,String> map1 = new HashMap<Integer,String>();   
   map1.put(5,"Mango");    
   map1.put(6,"Apple");    
   map1.put(7,"Banana");   
   map1.put(8,"Grapes");
   map.putAll(map1);
   System.out.println("Iterating Hashmap...");
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }
   System.out.println("Value for the key 103: "+map.get(103));
   map.remove(1);
   System.out.println("Iterating Hashmap...");
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }
   map.replace(103,"Rohith");
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }
   map.replaceAll((k,v)->"Ajay");
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }
  }  
}  
