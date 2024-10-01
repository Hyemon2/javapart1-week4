package Tutorial_week12;

public class Calculator {
    public static void calculate(String formula) {
        String[] tokens = formula.split("\\+");
        if (tokens.length != 2) {
            System.out.println("Invalid formula.");
            return;
        }

        String first = tokens[0];
        String second = tokens[1];

        double f, s;
        try {
            f = Double.parseDouble(first);
            s = Double.parseDouble(second);
        } catch (NumberFormatException e) {
            System.out.println("Invalid formula. Numeric values expected.");
            return;
        }

        double result = f + s;
        System.out.println(first + " + " + second + " = " + result);
    }
}
