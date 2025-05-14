package Chap01.section03;

public class S6_Printf {
public static void main(String[] args) {
	System.out.println(); // 줄바꿈
//  사용법: System.out.printf("%d,정수)
	System.out.printf("%d",10);
	System.out.println(); // 줄바꿈
//	사용법: System.out.printf("%s","글자")  // string
	System.out.printf("%s","hi"); 
	System.out.println(); // 줄바꿈
	
//	사용법: System.out.printf("%x"10);
	System.out.printf("%x",10);  // hex(16진수)
	System.out.println(); // 줄바꿈
	
//	소수점 자르기 가능
//	사용법: System.out.printf("%.자리수f",실수);
	System.out.printf("%.3f",3.14127); // flaot 실수
	
}
}
