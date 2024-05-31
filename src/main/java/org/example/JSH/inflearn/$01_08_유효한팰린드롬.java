package org.example.JSH.inflearn;

import java.io.*;

/*
설명
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
알파벳 이외의 문자들의 무시합니다.

입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

출력
첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 */
public class $01_08_유효한팰린드롬 {
    public static String solution(String str)  {
        int lt = 0, rt = str.length()-1;
        while (lt <= rt) {
            if (!Character.isAlphabetic(str.charAt(lt))) lt++;
            else if (!Character.isAlphabetic(str.charAt(rt))) rt--;
            else {
                if (str.charAt(lt) != str.charAt(rt)) {
                    return "NO";
                }
                lt++;
                rt--;
            }

        }
        return "YES";

    }
    public static void main(String[] args)throws IOException {

        //scanner와 sout을 쓰는 예제와 20~60ms정도 차이남
        //백준 15552번: 빠른 A+B문제 참조해서 공부해볼것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().toUpperCase();
        bw.write(solution(str));
        bw.flush();
        bw.close();

    }
}
