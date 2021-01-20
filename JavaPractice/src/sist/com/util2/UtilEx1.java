package sist.com.util2;

import java.util.StringTokenizer;

public class UtilEx1 {
	
	public void actionEx1() {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT EMPNO, ENMAE, SAL ")
		  .append("FROM EMP ")
		  .append("WHERE SAL = 3000 ")
		  .append("GROUP BY DEPTNO");
		sb.insert(0, 5>3); // 기존 문자열에 삽입, boolean으로 넣으면 true, false
		sb.deleteCharAt(0); // True에서 0번째인 T가 날아감
		sb.delete(0, 4); // 0~4 구간 문자열 지움
		System.out.println(sb.capacity()); // capacity : 배열의 길이값
		sb.reverse(); // 뒤집기
		System.out.println(sb);
	}
	
	public void actionEx2(String data) {
		if(data.startsWith("[STONE]")) { // [STONE]으로 시작하면 true
			int x = Integer.parseInt(data.substring(data.indexOf("]")+1).split(" ")[0].split("=")[1]); // " "기준 0번째의 "="기준 1번째 값
			int y = Integer.parseInt(data.substring(data.indexOf("]")+1).split(" ")[1].split("=")[1]);
			System.out.println(x + " + "+y+" = "+(x+y));
		}
	}
	
	public void actionEx3(String value) {
		System.out.println(value.replace('a', 'z')); // 그냥 찍어도 나옴. value가 바꼈다고 착각하기 쉬움.
		System.out.println(value.replace("b", "UU")); // 문자열 변환
		value = value.replace('a', 'z'); // replace를 해서 변환된 값을 return 하는 것뿐이지 원본이 바뀌는 것은 아니다. 그래서 value로 받음.
		System.out.println(value);
		System.out.println(value.equals("ZBC")); // false
		System.out.println(value.equals("ZBC".toLowerCase())); // 소문자로 변경, true
		System.out.println(value.trim().equals("zbc")); // trim은 문자열 좌우 공백 지워줌.
		System.out.println(value.replace(" ", "").equals("zbc")); // 공백이 문자열 사이에 있을 경우 replace로 수정
		
	}
	
	public void actionEx4() {
		StringTokenizer s = new StringTokenizer("2021/9/1","/"); // 파라미터 없는 생성자는 무의미
		System.out.println(s.countTokens());
		/*while(s.hasMoreElements()) {
			System.out.println(s.nextElement() instanceof Integer); // Integer로 형변환할 수 없음. String으로 instanceof 해보면 true
		};*/
		for(;s.hasMoreTokens();) { // 위에 while문과 동시 실행하면 next가 다 돌은 상태이기 때문에 이게 안돌아감.
			System.out.println(s.nextToken());
		}
	}
	
	public static void main(String[] args) {
		UtilEx1 u = new UtilEx1();
		//u.actionEx1();
		//u.actionEx2("[STONE]X=100 Y=250");
		//u.actionEx2("[WIN]BLUE");
		//u.actionEx3("ab c");
		u.actionEx4();
		
	}
}
