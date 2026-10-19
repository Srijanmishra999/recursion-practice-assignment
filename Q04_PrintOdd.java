import java.util.Scanner;

public class Q04_PrintOdd {
    static void printOdd(int current, int n) {
        if (current > n) return;
        System.out.print(current);
        if (current + 2 <= n) System.out.print(" ");
        printOdd(current + 2, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) printOdd(1, n);
        System.out.println();
    }
}
