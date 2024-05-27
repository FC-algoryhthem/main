package org.example.REG;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1_3b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int max = 0;
        String answer = "";

        while(st.hasMoreTokens()){ //다음 꺼낼 토큰이 있으면 아래 코드 실행
            String token = st.nextToken(); // token이라는 변수로 토큰 따로 예쁘게 저장해두기
            if(max < token.length()) { // 토큰의 길이가 max보다 크면
                max = token.length(); // max값을 해당 토큰의 길이로 바꾸고
                answer = token; //해당 토큰을 answer에 저장
            }
        }
        System.out.println(answer);

    }
}
