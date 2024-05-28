import java.util.*;

public class Main {
    public String solution(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i);
            if (('a' <= num) && (num <= 'z')) num -= 32;
            else if (('A' <= num) && (num <= 'Z')) num += 32;
            result.append((char)num);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // 문자열 하나 읽어옴

        System.out.print(T.solution(str));
    }
}