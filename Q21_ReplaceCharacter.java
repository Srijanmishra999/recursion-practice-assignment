import java.util.Scanner;

public class Q21_ReplaceCharacter {
    static void replace(String s, char oldChar, char newChar,
                        int index, StringBuilder result) {
        if (index == s.length()) return;
        char current = s.charAt(index);
        result.append(current == oldChar ? newChar : current);
        replace(s, oldChar, newChar, index + 1, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] chars = sc.nextLine().trim().split("\\s+");
        char oldChar = chars[0].charAt(0);
        char newChar = chars[1].charAt(0);
        StringBuilder result = new StringBuilder();
        replace(s, oldChar, newChar, 0, result);
        System.out.println(result);
    }
}
