package Chap03.Section02;
/**
 * 
 * @author user
 * 누적합 코딩하기(알고리즘 활용)
 * 예제) 1~10까지 누적시켜서 표시하기: 1+2+3+...+10=55
 */
public class S2_For2 {

  public static void main(String[] args) {
//		1) 변수 준비: 변수=0;
//	    int sum=0;
//	    sum=sum+1// 1=0+1;
//	  sum=sum+1// 1=0+1;
//	  sum=sum+2// 3=1+2;
//	  sum=sum+3//1=0+1;
//	  sum=sum+5// 1=0+1;
//	  sum=sum+6// 1=0+1;//
//	  sum=sum+7// 1=0+1;
//	  sum=sum+8// 1=0+1;
//	  sum=sum+9// 1=0+1;
//	  sum=sum+10// 1=0+1;
	    int sum=0;
	    for (int i = 1; i <=10; i++) {
//	    	1) i=1, 1<=10(참), 1=0+1 => sum=1, i++(i=2)
//	    	2) i=2, 2<=10(참), 3=1+2 -> sum=3, i++
//	    	...
//	    	10) i=1o 10<=10(참), 55=45+10=>sum=55, i++(i=11)
//	    	11) i=11 11<=(거짓), 중단{}탈출
			sum=sum+i; // 누적합 알고리즘 코딩
		}
	    System.out.println(sum);
	}
}
