package org.example.kky.inlearn;

import java.util.Scanner;

/**
 * 2. 대소문자 변환 설명 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * <p>
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * <p>
 * <p>
 * 출력 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 */

public class 인프런_대소문자_변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            //소문자
            if (c >= 'a') {
                c -= ('a' - 'A');
                result.append(c);
                continue;
            }
            //대문자
            if (c < 'a') {
                c += ('a' - 'A');
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
