package org.example.JSH;

public class ArrayQuiz {
    public static void main(String[] args) {
        //quiz 1
        System.out.println("quiz1");
        int[] arr1 = new int[25];
        for (int i = 1; i <= arr1.length; i++) {
            arr1[i-1] = i;
        }

        int[][] arr2 = new int[5][5];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i / 5][i % 5] = arr1[i];
        }

        for (int[] a : arr2) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        //quiz 2
        System.out.println("quiz2");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr2[i / 5][ i % 5];
        }

        for (int b : arr1) {
            System.out.print(b + " ");
        }
        System.out.println();

        //quiz 3
        System.out.println("quiz3");
        int[] arr = {7, 8, 8, 6, 2, 4, 4, 5, 7};

        System.out.println("quiz3-1");
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }

        int[] ch = new int[max + 1];
        for (int x : arr) {
            if (ch[x] == 0) {
                ch[x] = 1;
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == 1)
                System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("quiz3-2");
        ch = new int[max + 1];
        for (int x : arr) {
            ch[x]++;
        }
        for (int i = 0; i < ch.length; i++) {
            for(int j = 0; j < ch[i]; j++)
                System.out.print(i + " ");
        }
    }
}
