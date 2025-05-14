package Chap03.Section01;

public class S3_if3 {
 public static void main(String[] args) {
	int a=9;
//	사용법: if(변수 > 값){실행문;}esle if(변수==값){실행문2;}else{실행문3;}
//	해석: 변수> 값 - 참이면 실행문 실행 
//	     변수 ==값 - 참이면 실행문 2 실행
//	모두 거짓이면 실행문 3이 실행됩니다.
	if(a>9) {System.out.println("출발");}
	else if(a==9){System.out.println("준비");}
	else {System.out.println("대기");}
	
	}
}
