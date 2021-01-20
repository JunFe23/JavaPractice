package sist.com.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;


//key |Value
// 1   100
// 2   500
// 2   500

public class UtilEx3 {   
   public void utilMethod1() {
      HashMap<Integer,String>map=new HashMap<Integer,String>(); // key 값이 Integer, value값이 String인 Hashmap
      map.put(1, "찬미");//key|value
      map.put(2, "찰리");//key|value
      map.put(2, "졸리");//key|value
      map.put(3, "피트");//key|value
      
      
//      map.clear(); // map 안을 clear함.
//      System.out.println(map.containsKey(10)); // key값이 10인 map data가 있는가? No
      //System.out.println(map.containsValue("졸리")); // Value값이 '졸리'인 map data가 있는가? ?Yes
      map.replace(2, "찰리"); // map에서 key값이 2인 곳의 Value값을 "찰리"로 대체해라
      //System.out.println(map); // {1=찬미, 2=찰리, 3=피트} 출력

      Iterator<Entry<Integer, String>>i=map.entrySet().iterator(); // map의 key값과 value값을 가진 entryset의 반복자 생성해서 i로 받음
      while(i.hasNext()) { // i의 다음값이 존재하면 true -> 반복
         Entry<Integer, String>entry=i.next(); // i값 받고 다음 i값으로
         System.out.println(entry.getValue()+" "+entry.getKey()); // 
      }
                  
   }   
   public void utilMethod2() {
      
   HashMap<Integer,ArrayList<HashMap<String, Double>>>map=new HashMap<Integer,ArrayList<HashMap<String, Double>>>(); // 가장 바깥쪽 HashMap 안쪽 내용 넣어서 map으로 받음
   ArrayList<HashMap<String, Double>>list1=new ArrayList<HashMap<String, Double>>(); // HashMap 바로 안쪽 list를 list1로 받음. 
   list1.add(dataInput("찰리",189.9)); // list1에 HashMap<String, Double> 형의 data를 추가
   list1.add(dataInput("찰미",170.5));
   list1.add(dataInput("수정",169.5));
   list1.add(dataInput("인성",199.5));   
   
   ArrayList<HashMap<String, Double>>list2=new ArrayList<HashMap<String, Double>>();
   list2.add(dataInput("성준",150.9));
   list2.add(dataInput("승호",171.5));
   list2.add(dataInput("철",169.5));
   list2.add(dataInput("지연",191.5));
   list2.add(dataInput("수현",192.5));
   
   
   ArrayList<HashMap<String, Double>>list3=new ArrayList<HashMap<String, Double>>();
   list3.add(dataInput("성빈",189.9));
   list3.add(dataInput("윤하",170.5));
   list3.add(dataInput("효진",169.5));
   map.put(1, list1); // 가장 바깥 map의 key 1에 list1을 넣음.
   map.put(2, list2); // 2
   map.put(3, list3); // 3
   disp(map);
   }
   public void disp(HashMap<Integer,ArrayList<HashMap<String, Double>>>map) {
          //map.keySet().iterator();
          /*for(Integer i:map.keySet()) {
             ArrayList<HashMap<String, Double>>a1=map.get(i);
             for(HashMap<String, Double> m:a1) {
                 for(Entry<String,Double>e:m.entrySet()) {
                    System.out.println(e.getKey()+" "+e.getValue());
                 }
             }
          }*/
          Iterator<Entry<Integer, ArrayList<HashMap<String, Double>>>>i= map.entrySet().iterator();
          for(;i.hasNext();) {
             Entry<Integer, ArrayList<HashMap<String, Double>>>entry=i.next();
             for(HashMap<String, Double> a:entry.getValue()) {
                for(Entry<String,Double>e:a.entrySet()) {
                   System.out.println(e.getKey()+" "+e.getValue());
                }
             }
          }
       
   }
   public HashMap<String, Double> dataInput(String s,Double d){ // HashMap<String, Double>형으로 반환하는 dataInput 메소드.
      
      HashMap<String, Double>map=new HashMap<String,Double>();
      map.put(s.concat("key"), d+10);
      return map;
   }
   public static void main(String[] args) {
      UtilEx3 u=new UtilEx3();
      //u.utilMethod1();
      u.utilMethod2();
      
   }

}












