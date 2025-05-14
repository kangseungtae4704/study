package Chap03.Section02;

import java.util.Iterator;

/**
 * 
 * @author user
 * 무하반복문: 1) for 2) while 
 * 무한히 반복 : 반드시 {} 실행블록안에 중단 조건이 있어야합니다.
 */
public class S6_InfiniteLoop {
 public static void main(String[] args) {
	 int i = 1; 
	 while (true) {
		System.out.println(i); // 무한히반복
		i++; // 1씩 증가 
//		TODO: 중단조건: if 조건문 
//		해석: i가 6이 되는 순간 중단 (1~5까지표시)
//		=> while{} 밖으로 강제 이동
		if(i==6) { 
			break;
//			TODO: for을 이용한 무한반복문 만들기
//			해석: j=1 참일떄 무한반복 
//	  for (int j = 1; true; j++); {
//		  System.out.println(j);
//		  if(j==6){
////		  TODO: 중단조건 if 조건문
//		  break;} // 강제중단
		
	}
		}
	}
}
