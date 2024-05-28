package org.example.JSH.inflearn;

import java.io.*;
/*
설명

N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.

두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.


출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class $01_04_단어뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_case = Integer.parseInt(br.readLine());
        while (test_case-- > 0) {
//            StringBuilder의 reverse()메서드를 이용한 1번 풀이
//            StringBuilder sb = new StringBuilder(br.readLine()).reverse();
//            bw.write(sb.toString()+'\n');

            // 직접 배열을 순회하며 바꾸는 2번 풀이
            String ans = "";
            for (char x : br.readLine().toCharArray()) ans = x + ans;
            bw.write(ans);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
