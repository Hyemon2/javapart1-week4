package Tutorial_week14;

public class EX_2{
	class SwapTest {
	    public static void swap(Inte x, Inte y) {

	    }
	   
	    public static void main(String[] args) {
	        int a, b;

	        a = 10;
	        b = 20;
	        Inte aa = new Inte(a);
	        Inte bb = new Inte(b);
	        swap(aa, bb);
	        a = aa.i;
	        b = bb.i;
	        System.out.println(a + "," + b);

	    }
	}
}

//메소드 내에서 매개변수로 전달되는 인스턴스를 변경하더라도 원본 인스턴스의 값이 변경되지 않기 때문이다.
//첫번째, SwaoTestInt 클래스의 swap 메소드이다. x와 y의 값이 변경되더라도 main 외부에서 사용하는 a와 b의 값은
//변경되지 않는다.
//두번째는 SwapTestWrong 클래스의 swap 메소드이다.
//Inte 객체 x와 y를 매개변수로 받아 temp 변수를 사용하여 값을 교환하지만, x와 y는 값이 아닌 참조 변수이므로, 
//인스턴스의 값이 교환되지 않는다.
//세번째, SwapTest 클래스의 swap 메소드는 아무 동작도 수행하지 않는다.