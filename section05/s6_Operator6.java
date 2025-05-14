package section05;
/**
 * 
 * @author user
 * 2개 글자가 일치하는 지 확인: 글자 1.equals("글자")
 * ==(비교)(등호사용비교) 하면안됨 => 정확하지 않음
 */
public class s6_Operator6 {
 public static void main(String[] args) {
	String a="Hello";
	String b="Hello";
	String c=new String("Hello");
	System.out.println(a.equals(b)); // true
	System.out.println(a.equals(c)); // true
}
}
