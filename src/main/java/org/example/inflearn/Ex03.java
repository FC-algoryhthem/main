// 틀림
import java.util.*;

public class Main {
    String result = "";
    int start = 0;
    int end = 0;

    public String solution(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') count++;
            else break;
        }
        int answer = count;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
                if (count > answer) {
                    answer = count;
                    end = i;
                    start = i - count + 1;
                }
            }
            else count = 0;
        }
        if( end == str.length()-1) result = str.substring(start);
        else result = str.substring(start, end + 1);

        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}