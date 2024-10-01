package Tutorial_week12;

public class EX_4 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.real = 1;
        c1.image = 2;

        Complex c2 = new Complex();
        c2.real = 3;
        c2.image = 4;

        Complex c3 = c1.add(c2);
        Complex c4 = c1.multiply(c2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("sum = " + c3);
        System.out.println("mul = " + c4);
    }
}
