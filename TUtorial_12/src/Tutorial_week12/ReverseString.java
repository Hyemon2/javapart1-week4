package Tutorial_week12;

import java.util.Scanner;

public class ReverseString {
    public static void reverseAndPrint() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        String reversed = reverse(input);
        System.out.println("역순으로 출력: " + reversed);
    }

    private static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
