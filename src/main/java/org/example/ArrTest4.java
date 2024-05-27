package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrTest4 {
    public static void main(String[] args) {
        //배열 arr 틀 만들고 랜덤값으로 값 초기화
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++) {
            arr[i] = (int)(Math.random()*10+1);
        }
        // 정렬 이전 배열의 상태 확인
        System.out.println(Arrays.toString(arr));

        System.out.println("---------");

        ArrayList<Integer> list = new ArrayList<>();

        // 가장 작은 값 min 찾기
        int min = 100;
        for(int i=0; i<arr.length;i++) {
            if(min>arr[i]){min=arr[i];}
        }

        // min과 같은 값을 가진 애들은 다음으로 작은 min값 찾을 때 또 될 수도 있으니 임의의 큰 값 100으로 치환
        for(int i=0; i<arr.length; i++){
            if(min==arr[i]){
                list.add(arr[i]);
                arr[i] = 100;
            }
        }

        System.out.println(list);

        //GG

        }
    }

