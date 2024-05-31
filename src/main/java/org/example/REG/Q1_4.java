package org.example.REG;


import java.util.Scanner;

/****
 *
 *
 * 4. 단어 뒤집기
 * 설명
 *
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 *
 *
 * ****/


public class Q1_4 {
    String[] solution(int n, String[] arr){

        for(int i = 0; i < n; i++){ // i는 String[] arr 를 도는 인덱스
            char[] chArr = arr[i].toCharArray();
            for(int j=0; j<chArr.length/2; j++){ //j는 문자들 위치를 바꾸기위해 char[] chArr 를 도는 인덱스
                int k = chArr.length-j-1; // j는 앞에서, k는 뒤에서
                char tmp = chArr[j];
                chArr[j] = chArr[k];
                chArr[k] = tmp;
            } // chArr 뒤집기 끝
        arr[i] = String.valueOf(chArr); //chArr를 다시 String으로 바꾸고 원래 arr에 넣기
        }

        return arr;

    }


    public static void main(String[] args) {
        Q1_4 q = new Q1_4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n]; // n크기의 String[] 생성

        for(int i=0; i<n; i++){ // 만들어준 String[]인 arr에 문자열 입력
            arr[i] = sc.next();
        }

        for(String x : q.solution(n, arr)){
            System.out.println(x);
        }

    }
}
