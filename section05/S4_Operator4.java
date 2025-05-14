package section05;
/**
 * 
 * @author user
 * 논리연산자: ||(or, 또는), 1개라도참이면 참
 *          &&(and, 그리고), 1개라도 거짓이면 거짓 
 * !(not,반대) : 값의 반대
 */
public class S4_Operator4 {
 public static void main(String[] args) {
	 boolean a=true;
	 boolean b=false;
	 System.out.println(a||b); 
	 System.out.println(a&&b); 
	 System.out.println(!a);   
	 System.out.println(!b);
} 
}
