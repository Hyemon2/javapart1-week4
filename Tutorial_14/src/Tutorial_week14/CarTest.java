package Tutorial_week14;

public class CarTest {
    private String model;
    private String color;
    private int speed;

    private int id;
    private static int numbers = 0;

    public CarTest(String m, String c, int s) {
        model = m;
        color = c;
        speed = s;
        id = ++numbers;
    }

    public static int getNumberOfCars() {
        return numbers;
    }
}
