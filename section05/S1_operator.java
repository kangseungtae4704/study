package section05;
/**
 * @author user
 * 증감연산자: 변수++(1증가), 변수 --(1감소)
 *          ++변수(1증가), --변수(1감소)
 */
public class S1_operator {
    public static void main(String[] args) {
		int x=10;
		int y=10;
		
		x++;
		System.out.println(x); //11
		++x;
		System.out.println(x);
		
		y--;
		System.out.println(y); //9
		--y;
		System.out.println(y); //8
	}
}
