package sist.com.innerClass;

public class AnonymousClass {
	String ov = "OuterValue";

	AnonymousClass() {
		new LocalInner() {
			String aiv = "AnonymousValue";
			
			public void method() {
				System.out.println(aiv);
			}
		}.method(); 
	}
	
	
}
