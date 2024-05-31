package org.example.REG;

import java.util.Scanner;

/****
 *
 *
 *
 *5. 특정 문자 뒤집기
 * 설명
 *
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 *
 *
 * ****/



public class Q1_5 {
    String solution(String str){
        String answer = "";
        char[] chArray = str.toCharArray();
        for(int i=0; i<chArray.length/2; i++){
            int j=chArray.length-i-1;
            char tmp;
            if(('A'<=chArray[i]&&chArray[i]<='Z')||('a'<=chArray[i]&&chArray[i]<='z')){
                tmp = chArray[i];
                chArray[i] = chArray[j];
                chArray[j] = tmp;
            }
        }
        answer = String.valueOf(chArray);

        return answer;
    }

    public static void main(String[] args) {
        Q1_5 q = new Q1_5();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(q.solution(str));

    }

}
