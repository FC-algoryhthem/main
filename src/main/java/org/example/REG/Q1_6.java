package org.example.REG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/****
 *
 *
 * 6. 중복문자제거
 * 설명
 *
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 *
 *
 * ****/



public class Q1_6 {
    ArrayList<Character> solution(String str){
        char[] chArray = str.toCharArray(); // 매개변수로 받은 str을 char[]로 변환
        int[] check = new int[chArray.length]; // 초기화 어차피 0으로 되니까 따로 안집어 넣어도 됨. 안 나온거면 0, 나온거면 1로 바꿀거임.
        ArrayList<Character> answer = new ArrayList<>(); // 답이 될 ArrayList

        for(int i=0; i<chArray.length; i++){ //i는 0부터 끝까지 도는 인덱스
            if(check[i]==0){ // i가 돌닫가 check배열이 0일때만 수행
                answer.add(chArray[i]); // 일단 answer에 값 add 시키고
                check[i]=1; // 해당 인덱스의 check자리 1로 바꾸고
                for(int j=i+1; j<chArray.length; j++){ // i+1부터 끝까지 도는 인덱스 로 i와 일치하는 녀석 찾기
                    if(chArray[j]==chArray[i]){ check[j]=1; } // 일치하는 녀석있으면 걔도 check 1 표시
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Q1_6 q = new Q1_6();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(char x : q.solution(str)){
            System.out.print(x);
        }

    }
}
