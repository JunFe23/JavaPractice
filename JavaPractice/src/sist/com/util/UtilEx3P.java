package sist.com.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//key |Value
// 1   100
// 2   500
// 3   600

public class UtilEx3P {
   
   public void utilMethod1() {
      HashMap<Integer,String>map = new HashMap<Integer,String>();
      map.put(1, "Âù¹Ì");//key|value
      map.put(2, "Âû¸®");//key|value
      map.put(2, "Á¹¸®");//key|value
      map.put(3, "ÇÇÆ®");//key|value
      
//      map.clear();
      System.out.println(map.containsKey(10));
      System.out.println(map.containsValue("Á¹¸®"));
      map.replace(2, "Âû¸®");
      System.out.println(map);
      
      /*Iterator<Entry<Integer, String>> i = map.entrySet().iterator();
      while(i.hasNext()) {
         Entry<Integer,String>entry = i.next();
         System.out.println(entry.getValue()+ " " + entry.getKey());
      }*/
      
      
      
      Set<Entry<Integer, String>> s = map.entrySet();
      
//      System.out.println(map.get(1));
      Iterator<Integer> i =  map.keySet().iterator();
      
      while(i.hasNext()) {
         Integer key = i.next();
         System.out.println("key=" + key +  " " + map.get(key));
      }
   }
   
   public static void main(String[] args) {
      UtilEx3P2 u = new UtilEx3P2();
      u.utilMethod1();
   }
}