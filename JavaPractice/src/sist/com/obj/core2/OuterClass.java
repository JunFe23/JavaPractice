package sist.com.obj.core2;

//정확한 말로는 클래스가 메모리에 올라오는 시점에 존재  -> new 해서 인스턴스가 만들어진 후에 heap에 존재
//static(실행 누르면 처음부터 존재하는 영역) -> instance(new 해서 만들어지는 객체의 일반영역)
//static : 미리 만들어짐
//instance : new 할때마다 그때그때 만들어짐
//local : 메서드 호출할때마다 그때그때 만들어짐

public class OuterClass {
 String ov = "OuterValue";
 static String sov = "StaticOuterValue";
 
 //멤버 내부 클래스
 class InnerClass{
//    static String siv = "StaticInnerValue"; // 외부가 생성되기 전에 내부가 먼저 static이 될수 없기 때문에 
    String iv = "InnerValue";
    
    InnerClass(){
       System.out.println("InnerClass");
    }
 }
 
 //static 내부 클래스
 static class StaticInnerClass{
    static String siv = "StaticInnerValue"; // static변수 가능
    String iv = "InnerValue";    
    
    StaticInnerClass(){
       System.out.println("StaticInnerClass");
    }
 }
 
 public void localClassTest() {
    
    //Local 내부 클래스
    class LocalInnerClass{
//       static String siv = "StaticInnerValue"; // static변수 불가
       //이 메서드가 호출 될지 안될지 모르는 상황인데 안쪽에서 미리 static변수가 만들어진다고???
       String iv = "InnerValue";
       
       LocalInnerClass(){
          System.out.println("LocalInnerClass");
       }
    }
    new LocalInnerClass(); // 그냥 new해봤음ㅋㅋ
 }
 
 
 OuterClass(){
    
    //익명 클래스.. 마찬가지로 static변수 안되겠지?
    new Object() {
//       static String siv = "StaticInnerValue";
       String story = "내일 눈오는거 실화임?";
       
       public void method() {
          System.out.println(story);
       }
    }.method();
 }
 
 
 public static void main(String[] args) {
    //공지사항 : 외부클래스생성할때마다 익명클래스가 생성되고 메서드 호출되니 감안하셈
//    new OuterClass();// 익명클래스 test
//    OuterClass.InnerClass inner = new OuterClass().new InnerClass(); // 멤버 내부클래스의 인스턴스 생성ver
//    OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass(); // 스태틱 내부클래스의 인스턴스 생성ver
//    new OuterClass().localClassTest(); // 로컬 내부클래스의 인스턴스 생성ver
    
 }
}