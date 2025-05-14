package Chap01.section03;
/**
 * 
 * @author user
 * 캐스팅: 자료형 변환(int ->long 등)
 */
public class S1_AutoCasting {
    public static void main(String[] args) {
		//TODO: 정수 종류: int(보통 정수), long(더 큰 정수)
    	//TODO: 작은 정수 -> 큰 정수 넣을때는 별이상 없음
    	int a=1; 
		long  b=a;
		
		System.out.println(b);
		
		//TODO: 실수 종류: float(보통실수), double(더 큰 실수)
		float c=1.5f;
		double d=c;
		System.out.println(d);
	}
}
