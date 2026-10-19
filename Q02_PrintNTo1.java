import java.util.Scanner;

public class Q02_PrintNTo1 {
    static void printNumbers(int n) {
        if (n == 0) return;
        System.out.print(n);
        if (n > 1) System.out.print(" ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
        System.out.println();
    }
}
