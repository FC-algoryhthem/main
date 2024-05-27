package org.example.JSH.inflearn;

import java.io.*;

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
