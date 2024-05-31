package org.example._0528;

import java.util.Arrays;
import java.util.Scanner;

//문
public class Quiz2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println((i+1) +"행" + (j+1) + "열" +" 번 째 정수 값을 입력하세요 : ");
                arr[i][j] = input.nextInt();
            }
        }

        // 배열 한 행씩 출력
        Arrays.stream(arr)
                .map(Arrays::toString)
                .forEach(System.out::println);

        Quiz2_2 main = new Quiz2_2();
        int result = main.bingoCnt(arr);
        System.out.println("빙고 개수는 : " + result);
    }

    public int bingoCnt(int[][] arr) {
        int lng = arr.length;
        int count = 0;

        //행, 열 체크
        for (int i = 0; i < lng; i++) {
            boolean row_check = true;
            boolean col_check = true;
            for (int j = 0; j < lng; j++) {
                if (j != 0) {
                    if (arr[i][j-1] != arr[i][j]) row_check = false;
                    if (arr[j][i] != arr[j-1][i]) col_check = false;
                }
            }
            if(row_check) count++;
            if(col_check) count++;
        }

        // 대각선 체크 대각선은 길이에서-1번까지 존재 가능
        for(int k = 0; k < lng-2; k++) {
            boolean dia_check = true;
            for (int i = 0, j = 0; j+k+1 < lng; i++, j++) {
                if (arr[i][j+k] != arr[i+1][j+k+1]) dia_check = false;
            }
            if(dia_check) count++;
        }
        return count;
    }
}