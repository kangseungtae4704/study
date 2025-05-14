package Chap01.section02;
/**
 * 
 * @param args
 * 진수를 알아봅시다: 2진수(0,1로 표시),
 * 8진수(0~7까지 표시),
 * 10진수(0~9까지 표시),
 * 16진수(0~15까지 표시),
 */
public class s4_Nueral {
   public static void main(String[] args) {
	   //TODO: 객체(그룹핑): 변수, 함수 여러개 묶어서 관리(목적)
	   //TODO: 16진수: 0~15까지(10~15혼동)
	   // 예) 0981015=> 해결: 10(a) 11(b) 12(c) 13(d) 14(e) 15(f)
	   String a=Integer.toBinaryString(10);
	   String b=Integer.toOctalString(11);
	   String c=Integer.toHexString(12);
			   System.out.println(a);
			   System.out.println(b);
			   System.out.println(c);
   }
}