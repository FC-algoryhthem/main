package org.example.REG;

import java.util.Scanner;

/****
 *
 *
 * 8. 유효한 팰린드롬
 * 설명
 *
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 *
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 *
 * 알파벳 이외의 문자들의 무시합니다.
 *
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 *
 * 출력
 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 *
 *
 * ****/




public class Q1_8 {

    String solution(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toUpperCase(); //replaceAll 정규식써서 영문자만 남기고 모두 대문자로

        StringBuilder sb = new StringBuilder(str); //reverse쓰려고 StringBuilder로 변환
        String revered_str = sb.reverse().toString(); //reverse시키고 바로 toString써서 str으로 변환

        if (revered_str.equals(str)) { //reverse 시키기 전과 후가 같은지 체크
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Q1_8 q = new Q1_8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(q.solution(str));

    }
}
