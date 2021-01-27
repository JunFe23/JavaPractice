package sist.com.io1;

public class IoEx1P {
	public void conToCon() {
		int temp = 0;
		try {
			System.out.println("Data : ");
			while((temp = System.in.read())!=-1) {
				System.out.println((char)temp);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void conToCon2() {
		byte []temp = new byte[10];
		try {
			System.out.println("Data : ");
			//System.in.read(temp, 0, 9);
			String a = new String(temp).trim();
			//System.out.println(a);
			
			/*for(byte b:temp) {
				System.out.println(b);
			}*/
			System.out.println(System.in.read(temp));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void conToCon3() {
		byte []temp = new byte[10];
		System.out.println("Data : ");
		try {
			int cnt = System.in.read(temp, 1, 9);
			System.out.println("cnt = " + cnt);
			for (int i = 0; i < temp.length; i++) {
				System.out.println(temp[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		IoEx1P i = new IoEx1P();
		i.conToCon3();
	}
}

