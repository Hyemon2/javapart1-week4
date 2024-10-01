package Tutorial_week12;
import java.util.Scanner;

public class EX_3 {
    public static void main(String[] args) {
        String formula;
        String first, second;
        double f, s;
        char op;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter formula :");
        formula = sc.nextLine();

        Calculator.calculate(formula);
    }
}