package Chap01.section02;
/**
 * 
 * @author user
 * 정수 알아보기: byte, short, int, long
 */
public class s1_type {
	public static void main(String[] args) {
		byte a=1; //정수(127~128), DRAM(비쌈)
		short b=10; //정수 (그 다음 작은 범위)
		int c=100; // 정수(*, 3번쨰 범위(4byte), 많이사용)
		long d=1000; // 정수(*, 제일 큰 숫자(8byte) 넣을 수 있음)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
