package org.example._0528;

import java.util.Scanner;

public class Quiz2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println((i+1) +"행" + (j+1) + "열" +" 번 째 정수 값을 입력하세요 : ");
                arr[i][j] = input.nextInt();
            }
        }
        // System.out.println(Arrays.deepToString(arr));

        Quiz2_1 main = new Quiz2_1();
        int result = main.bingoCnt(arr);
        System.out.println("빙고 개수는 : " + result);
    }

    public int bingoCnt(int[][] arr) {
        boolean check = true;
        int lng = arr.length;
        int count = 0;

        for (int i = 0; i < lng; i++) {
            for (int j = 0; j < lng; j++) {
                if(j != 0 && j != lng-1 && arr[i][j-1] != arr[i][j+1]) check = false;
            }
            if(check) count++;
        }

        check = true;
        for (int j = 0; j < lng; j++) {
            for (int i = 0; i < lng; i++) {
                if(i != 0 && i != lng-1 && arr[i+1][j] != arr[i-1][j]) check = false;
            }
            if(check) count++;
        }

        check = true;
        for (int i = 0, j = 0; j+1 < lng; i++, j++) {
                if (arr[i][j] != arr[i+1][j+1]) check = false;
        }
        if(check) count++;

        check = true;
        for (int i = 0, j = 0; j+2 < lng; i++, j++) {
            if (arr[i][j+1] != arr[i+1][j+2]) check = false;
        }
        if(check) count++;

        check = true;
        for (int i = 0, j = 0; j+3 < lng; i++, j++) {
            if (arr[i][j+2] != arr[i+1][j+3]) check = false;
        }
        if(check) count++;

        check = true;
        for (int i = 0, j = 0; j+4 < lng; i++, j++) {
            if (arr[i][j+3] != arr[i+1][j+4]) check = false;
        }
        if(check) count++;


        return count;
    }
}
/*
 조건 1. 행이 모두 같다. i-고정 j-변동
 조건 2. 열이 모두 같다. i-변동 j-고정
 조건 3. 대각선으로 모두 간다.
*/
