import java.util.Scanner;

public class Q20_RemoveCharacter {
    static void remove(String s, char c, int index, StringBuilder result) {
        if (index == s.length()) return;
        if (s.charAt(index) != c) result.append(s.charAt(index));
        remove(s, c, index + 1, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        StringBuilder result = new StringBuilder();
        remove(s, c, 0, result);
        System.out.println(result);
    }
}
