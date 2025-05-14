package Chap01.section03;
/**
 * 
 * @author user
 * 글자 숫자로 바꾸기
 */
public class S4_Conversion {
   public static void main(String[] args) {
	String a="10";
	//사용법: int= 변수Integer.parseInt(글자, 진수);
	// 추가: 10진수 생략가능 
	int b=Integer.parseInt(a,10);
	System.out.println(b);
	
	int c=Integer.parseInt(a,2);
	System.out.println(c);
}
}
