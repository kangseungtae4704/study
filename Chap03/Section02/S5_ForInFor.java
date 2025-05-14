package Chap03.Section02;

public class S5_ForInFor {
  public static void main(String[] args) {
//	1) 반복안반복문(2중반복문): 안쪽반복문의 결과를 다시 반복
//	                       => 안쪽반복문의 결과: A
//	                       -> 2번 반복: AA를 화면에 표시
	  for (int j = 2; j <= 9; j++) {
		  for (int i = 1; i <= 9; i++) {
//			  1) j=2, i=1 i<=9(참) : 안쪽반복문이 계속 실행(거짓이 될떄까지)
//			  ...
//			  2) j=2, i=10, 10<=9(거짓), 안쪽 반복문 중단
//			  3) j=3, i=1, 1<=9(참), i++(i=2) : 안쪽반복문 계속실행(거짓이 될떄까지)
//			  4) j=4, 4 <=3(거짓), 바깥쪽 반복문도 중단
			  System.out.println(j+"X"+i+"="+(j*i));
		}
	}
//	                       
}
}
