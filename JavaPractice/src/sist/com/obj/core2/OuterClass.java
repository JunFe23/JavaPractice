package sist.com.obj.core2;

//��Ȯ�� ���δ� Ŭ������ �޸𸮿� �ö���� ������ ����  -> new �ؼ� �ν��Ͻ��� ������� �Ŀ� heap�� ����
//static(���� ������ ó������ �����ϴ� ����) -> instance(new �ؼ� ��������� ��ü�� �Ϲݿ���)
//static : �̸� �������
//instance : new �Ҷ����� �׶��׶� �������
//local : �޼��� ȣ���Ҷ����� �׶��׶� �������

public class OuterClass {
 String ov = "OuterValue";
 static String sov = "StaticOuterValue";
 
 //��� ���� Ŭ����
 class InnerClass{
//    static String siv = "StaticInnerValue"; // �ܺΰ� �����Ǳ� ���� ���ΰ� ���� static�� �ɼ� ���� ������ 
    String iv = "InnerValue";
    
    InnerClass(){
       System.out.println("InnerClass");
    }
 }
 
 //static ���� Ŭ����
 static class StaticInnerClass{
    static String siv = "StaticInnerValue"; // static���� ����
    String iv = "InnerValue";    
    
    StaticInnerClass(){
       System.out.println("StaticInnerClass");
    }
 }
 
 public void localClassTest() {
    
    //Local ���� Ŭ����
    class LocalInnerClass{
//       static String siv = "StaticInnerValue"; // static���� �Ұ�
       //�� �޼��尡 ȣ�� ���� �ȵ��� �𸣴� ��Ȳ�ε� ���ʿ��� �̸� static������ ��������ٰ�???
       String iv = "InnerValue";
       
       LocalInnerClass(){
          System.out.println("LocalInnerClass");
       }
    }
    new LocalInnerClass(); // �׳� new�غ�������
 }
 
 
 OuterClass(){
    
    //�͸� Ŭ����.. ���������� static���� �ȵǰ���?
    new Object() {
//       static String siv = "StaticInnerValue";
       String story = "���� �����°� ��ȭ��?";
       
       public void method() {
          System.out.println(story);
       }
    }.method();
 }
 
 
 public static void main(String[] args) {
    //�������� : �ܺ�Ŭ���������Ҷ����� �͸�Ŭ������ �����ǰ� �޼��� ȣ��Ǵ� �����ϼ�
//    new OuterClass();// �͸�Ŭ���� test
//    OuterClass.InnerClass inner = new OuterClass().new InnerClass(); // ��� ����Ŭ������ �ν��Ͻ� ����ver
//    OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass(); // ����ƽ ����Ŭ������ �ν��Ͻ� ����ver
//    new OuterClass().localClassTest(); // ���� ����Ŭ������ �ν��Ͻ� ����ver
    
 }
}