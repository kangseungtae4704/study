/**
 * 
 */
package Chap03.Section01;

/**
 * @author user
 *
 */
public class S5_Switch {
 public static void main(String[] args) {
	int a=9; 
//	사용법: switch(변수){case 값1: 실행문; break; case 값2: 실행문2; break
//	default: 실행문 3; break;}
//	해석: 변수가 값1이면 실행문 실행 
//	     변수가 값2이면 실행문2 실행
//	     모두 아니면 실행문3 실행
	switch (a) {
//	case=> a가 x값이맞나요? 물어보는거
	case 9: 
		System.out.println("출발");
		break;
	case 8: System.out.println("준비");
	default:
		System.out.println("대기");
		break;
	}
}
}
