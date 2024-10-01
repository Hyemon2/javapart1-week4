package Tutorial_week14;

public class Inte {
    int i;

    public Inte(int a) {
        i = a;
    }
}

class IncrTest {
    public static void increment(int x) {
        x++;
    }

    public static void increment(Inte x) {
        x.i++;
    }
}