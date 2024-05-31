package org.example.REG;

import java.util.Arrays;
import java.util.Scanner;


/****
 *
 *
 * 7. 회문 문자열
 * 설명
 *
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 *
 * 출력
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 *
 *
 * ****/



public class Q1_7 {
    String solution(String str){
        String answer = "YES";
        str = str.toLowerCase(); // 문제에서 원하는 답은 YES/NO 니까 str 훼손시켜도 됨. 그냥 toLowerCase 때려버림
        char[] chArr=str.toCharArray(); // String을 chArr로 변환

        for(int i=0; i<chArr.length/2; i++){ // i는 배열 길이의 절반만
            int j = chArr.length-i-1; // 반대쪽에서 j가 돌아 줄거임
            if(!(chArr[i]==chArr[j])){
                answer = "NO";
                break; // 같지 않다면 더 볼 것도 없음. 그래서 break
            }
        }
        return answer; // 초기값을 YES로 잡아놔서 break 안 당하고 무사히 for문 탈출했으면 YES 띄울거임
    }


    public static void main(String[] args) {
        Q1_7 q = new Q1_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(q.solution(str));

    }
}
