import java.util.Scanner;

public class Q18_BinaryToDecimal {
    static long convert(String s, int index) {
        if (index == s.length()) return 0;
        int digit = s.charAt(index) - '0';
        return digit * powerOfTwo(s.length() - index - 1)
                + convert(s, index + 1);
    }

    static long powerOfTwo(int exponent) {
        if (exponent == 0) return 1;
        return 2 * powerOfTwo(exponent - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(convert(s, 0));
    }
}
