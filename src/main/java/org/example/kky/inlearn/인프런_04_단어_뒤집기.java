package org.example.kky.inlearn;

import java.util.Scanner;

/**
 * 4. 단어 뒤집기 설명 N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * <p>
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 * <p>
 * <p>
 * 출력 N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class 인프런_04_단어_뒤집기 {
    /*
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            String reverse = "";
            for (int i = 0; i < n; i++) {
                reverse = sc.nextLine();
                String s = swapPolrar(reverse);
                System.out.println(s);
            }
        }
        public static String swapPolrar(String reverse) {
            int start = 0;
            int end = reverse.length() - 1;
            char[] charArray = reverse.toCharArray();
            char temp;
            while (start <= end) {
                temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
            return new String(charArray);
        }
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String reverse;
        for (int i = 0; i < n; i++) {
            reverse = sc.nextLine();
            String s = swapPolrar(reverse);
            System.out.println(s);
        }
    }

    public static String swapPolrar(String reverse) {
        int start = 0;
        int end = reverse.length() - 1;
        String leftResult = "";
        String rightResult = "";
        while (start <= end) { //true로 해도 아무 문제가 없는데 채점 사이트에서는 런타임 에려
            System.out.println("leftResult = " + leftResult);
            System.out.println("rightResult = " + rightResult);
            leftResult = "" + leftResult + reverse.charAt(end);
            if (start == end) {
                break;
            }
            rightResult = "" + reverse.charAt(start) + rightResult;
            start++;
            end--;
        }
        return leftResult + rightResult;
    }
}
