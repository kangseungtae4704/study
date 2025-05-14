package Chap01.section04;

import java.util.Scanner;

/**
 * 
 * @author user
 * 1 문장 입력 받기: 마지막에 enter키 치면 1문장(참고)
 * 1문장, 1단어: 함수를 같이 사용하시면 오류가 발생할 가능성이 있음
 */
public class S5_Scanner5 {
 public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	String b=a.nextLine(); // 1문장 
	System.out.println(b);
}
}
