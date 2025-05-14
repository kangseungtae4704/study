package Chap01.section03;
/**
 * 
 * @author user
 * 글자 실수 -> 진짜 실수로 바꾸기
 */
public class S5_Conversion2 {
    public static void main(String[] args) {
		String a="1.5";
		//사용법: double 변수=Double.parseDouble(글자);
		double b=Double.parseDouble(a);
		System.out.println(b);
	}
}
