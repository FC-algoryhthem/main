package org.example.JSH.inflearn;

import java.io.*;


    설명
    한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
    대소문자를 구분하지 않습니다. 문자열의 길이는 100을 넘지 않습니다.

    입력
    첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
    문자열은 영어 알파벳으로만 구성되어 있습니다.

    출력
    첫 줄에 해당 문자의 개수를 출력한다.

public class $01_01_문자찾기 {
    public static void main(String[] args) throws IOException {
        //BufferedReader와 BufferedWriter 둘다 Scanner, System.out.println()과 유사하지만 속도 측면에서 훨씬 빠름
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //문자열과 문자 둘다 대문자나 소문자로 일치
        String s = br.readLine().toUpperCase();
        //char c = br.readLine().toUpperCase().charAt(0);
        char c = Character.toUpperCase(br.readLine().charAt(0));

        //문자열 순회하며 문자 개수 카운팅
        int cnt = 0;
        for (char x : s.toCharArray())
            if (x == c) cnt++;

        bw.write(cnt + ""); // 출력
        bw.newLine(); // 줄바꿈, bw.write("\n");도 가능
        bw.flush(); // 스트림을 비움
        bw.close(); // 스트림을 닫음
    }
}