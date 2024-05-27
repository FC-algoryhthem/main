package org.example;

import java.util.*;

public class ArrTest3 {
    public static void main(String[] args) {

        // 우선 arr 배열의 틀 만들기
        int arr[] = new int[10];

        // arr 배열에 값 집어넣기
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random()*10+1); //1부터 10까지 랜덤값
        }

        // 중복제거하기 전에 상태 보기
        System.out.println(Arrays.toString(arr));

        System.out.println("---------");

        ArrayList<Integer> list = new ArrayList();

        // 중복제거 시작
        int count; // 중복되는 게 있으면 count 증가
        for(int i=0; i<arr.length; i++) { // i는 중복인지 아닌지 기준
            count = 0;
            for(int j=0; j<arr.length; j++) { // j는 i와 비교하기위한 비교군들
                if(arr[i]==arr[j]) count++; // 만약 중복이라면 check 1 로 만들고 더 검색할 필요없이 break
            }
            if(count==1){list.add(arr[i]);} // j 다 돌았는데 count가 1이라는 것은 자기 자신 하나만 count해주고 다른 건 없었다는 뜻
        }

        System.out.println(list);




    }
}
