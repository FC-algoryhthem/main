import java.util.*;

public class Main {
    public int solution(String str, char ch) {
        int count = 0;
        if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);
        }
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i);
            if ((97 <= num) && (num <= 122))
                num = (char) (num - 32);
            if (num == ch)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // 문자열 하나 읽어옴
        char ch = kb.next().charAt(0); // 문자 하나 읽어옴

        System.out.print(T.solution(str, ch));
    }
}

//import java.util.*;
//
//public class Main {
//    public int solution(String str, char ch) {
//        int count = 0;
//        str = str.toUpperCase();
//        ch = Character.toUpperCase(ch);
//
//        for(int i=0; i<str.length(); i++) {
//            if(ch == str.charAt(i)) count++;
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next(); //문자열 하나 읽어옴
//        char ch = kb.next().charAt(0); //문자 하나 읽어옴
//
//        System.out.print(T.solution(str, ch));
//    }
//}