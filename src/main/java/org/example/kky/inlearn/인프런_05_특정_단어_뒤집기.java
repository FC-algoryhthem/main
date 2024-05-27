package org.example.kky.inlearn;

import java.util.Scanner;

public class 인프런_05_특정_단어_뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String replaced = str.replaceAll("[a-zA-Z]", "0");
        char[] replacedSpecial = str.replaceAll("[^a-zA-Z]", "").toCharArray();

        for (int i = replacedSpecial.length - 1; i >= 0; i--) {
            replaced = replaced.replaceFirst("0", replacedSpecial[i] + "");
        }

        System.out.println(replaced);
    }
}
