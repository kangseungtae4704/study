package Chap01.section03;

public class S3_Ascii {
public static void main(String[] args) {
	// 아스키 응용: char 변수=값;
	// int 변수2=변수;(아크키코드 숫자)
	char a='A'; //65(2byte)
			int b=a; // 45byte
	System.out.println(b);
	
	char c=(char)b;
	System.out.println(c);
}
}
