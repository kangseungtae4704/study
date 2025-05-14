package Chap01.section01;

public class S7_swap {
public static void main(String[] args) {
	int a= 3; 
	int b= 2; 
	int t=0;
	// a=b에 의해 a의 값이 사라지기떄문에 t=a;를 통해 
	// a값인 3을 임시저장 후 b에 적용
	t=a;   //t=3   (a=3)
	a=b;   // a=3, (a=b) a=2 
	b=a;   // b=2, (a=2) b=2
	b=t;   // t=3, b=3 
	System.out.println(a);
	System.out.println(b);
}
}
