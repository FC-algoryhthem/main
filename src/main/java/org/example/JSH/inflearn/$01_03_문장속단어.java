package org.example.JSH.inflearn;

import java.io.*;
import java.util.StringTokenizer;

/**
 설명

 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

 문장속의 각 단어는 공백으로 구분됩니다.


 입력
 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.


 출력
 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한

 단어를 답으로 합니다.
 **/
public class $01_03_문장속단어 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        StringTokenizer를 이용한 1번 풀이
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        String answer = "";
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            if (max < tmp.length()) {
                answer = tmp;
                max = answer.length();
            }
        }

//        String 클래스의 split메서드를 활용한 2번 풀이
//        String[] str = br.readLine().split(" ");
//        int max = Integer.MIN_VALUE;
//        String answer = "";
//        for (String x : str) {
//            if (max < x.length()){
//                max = x.length();
//                answer =x;
//            }
//        }
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
