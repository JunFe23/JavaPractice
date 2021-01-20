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
      HashMap<Integer,String>map=new HashMap<Integer,String>(); // key ���� Integer, value���� String�� Hashmap
      map.put(1, "����");//key|value
      map.put(2, "����");//key|value
      map.put(2, "����");//key|value
      map.put(3, "��Ʈ");//key|value
      
      
//      map.clear(); // map ���� clear��.
//      System.out.println(map.containsKey(10)); // key���� 10�� map data�� �ִ°�? No
      //System.out.println(map.containsValue("����")); // Value���� '����'�� map data�� �ִ°�? ?Yes
      map.replace(2, "����"); // map���� key���� 2�� ���� Value���� "����"�� ��ü�ض�
      //System.out.println(map); // {1=����, 2=����, 3=��Ʈ} ���

      Iterator<Entry<Integer, String>>i=map.entrySet().iterator(); // map�� key���� value���� ���� entryset�� �ݺ��� �����ؼ� i�� ����
      while(i.hasNext()) { // i�� �������� �����ϸ� true -> �ݺ�
         Entry<Integer, String>entry=i.next(); // i�� �ް� ���� i������
         System.out.println(entry.getValue()+" "+entry.getKey()); // 
      }
                  
   }   
   public void utilMethod2() {
      
   HashMap<Integer,ArrayList<HashMap<String, Double>>>map=new HashMap<Integer,ArrayList<HashMap<String, Double>>>(); // ���� �ٱ��� HashMap ���� ���� �־ map���� ����
   ArrayList<HashMap<String, Double>>list1=new ArrayList<HashMap<String, Double>>(); // HashMap �ٷ� ���� list�� list1�� ����. 
   list1.add(dataInput("����",189.9)); // list1�� HashMap<String, Double> ���� data�� �߰�
   list1.add(dataInput("����",170.5));
   list1.add(dataInput("����",169.5));
   list1.add(dataInput("�μ�",199.5));   
   
   ArrayList<HashMap<String, Double>>list2=new ArrayList<HashMap<String, Double>>();
   list2.add(dataInput("����",150.9));
   list2.add(dataInput("��ȣ",171.5));
   list2.add(dataInput("ö",169.5));
   list2.add(dataInput("����",191.5));
   list2.add(dataInput("����",192.5));
   
   
   ArrayList<HashMap<String, Double>>list3=new ArrayList<HashMap<String, Double>>();
   list3.add(dataInput("����",189.9));
   list3.add(dataInput("����",170.5));
   list3.add(dataInput("ȿ��",169.5));
   map.put(1, list1); // ���� �ٱ� map�� key 1�� list1�� ����.
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
   public HashMap<String, Double> dataInput(String s,Double d){ // HashMap<String, Double>������ ��ȯ�ϴ� dataInput �޼ҵ�.
      
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












