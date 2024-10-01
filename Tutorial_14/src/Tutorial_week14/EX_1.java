package Tutorial_week14;

public class EX_1 {
	public static void increment(int[] x) {
        for (int i = 0; i < x.length; i++)
            x[i]++;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Inte bb = new Inte(b);
        increment(new int[] {a});
        increment(new int[] {bb.i});
        b = bb.i;
        System.out.println(a + "," + b);

        int[] c = {1, 2, 3, 4, 5};
        increment(c);
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");

    }
}
//increment 메서드에서 오류가 발생하는 이유는 매개변수의 타입이 일치하기 않기 때문이다.
//increment 메서드는 int[]타입을 매개 변수로 받으나, main메서드에서 호출할때 a와 bb는
//각각 int타입과 Inte 타입이다.
//따라서, increment 메서드를 호출할때 int[]타입인 c를 사용해야한다.
