package Tutorial_week14;

class SwapTestInt {
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
   
    public static void main(String[] args) {
        int a, b;

        a = 10;
        b = 20;
        swap(a, b);
        System.out.println(a + "," + b);

    }
}
class Inte {
    int i;

    public Inte(int a) {
        i = a;
    }
}

class SwapTestWrong {
    public static void swap(Inte x, Inte y) {
        Inte temp = x;
        x = y;
        y = temp;
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

