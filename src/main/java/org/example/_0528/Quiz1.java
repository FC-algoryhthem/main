package org.example._0528;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[3];

        System.out.println("정수 값을 입력하세요 : ");
        for (int i = 0; i < arr.length; i++) arr[i] = input.nextInt();

        Quiz1 main = new Quiz1();
        int result = main.mid(arr);
        System.out.println("중간 값은 : " + result);
    }

    public int mid(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        if (min == max) result = min;
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min && arr[i] != max) result = arr[i];
            }
        }
        return result;
    }
}

// 1,1,2의 경우에는 중간크기 뭐로 설정?

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("정수의 개수를 입력하세요");
//        int n = input.nextInt();
//        while (n % 2 == 0) {
//            System.out.println("홀수만 가능합니다. 다시 입력하세요");
//            n = input.nextInt();
//        }
//        int arr[] = new int[n];
//
//        System.out.println("정수 값을 입력하세요 : ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        Main main = new Main();  // 객체 생성
//        int result = main.mid(arr);
//        System.out.println("중간 값은 : " + result);
//    }
//
//    public int mid(int[] arr) {
//        int max = arr[0];
//        int min = arr[0];
//        int result = 0;
//        int rot = arr.length/2;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) max = arr[i];
//            if (min > arr[i]) min = arr[i];
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != min && arr[i] != max) result = arr[i];
//        }
//        return result;
//    }
//}

