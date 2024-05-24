package org.example.kky;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class D_3Quiz {

    public static void main(String[] args) {
        oneDToTwoD();
        TwoDToOneD();
        randomArr();
    }

    /*
     *1  2  3  4  5
     *6  7  8  9  10
     *11 12 13 14 15
     *16 17 18 19 20
     *21 22 23 24 25
     *
     * */
    public static void oneDToTwoD() {
        int[] arr = arr();
        //X좌표 = 5 / arr.length;
        //Y좌표 = 5 % arr.length;
        int x = 3;
        int y = 3;
        System.out.println(arr[(x * 5) + y]);
    }

    private static int getXYNumber(int[] arr, int x, int y) {
        return arr[x + (y * 5)];
    }

    private static int[] arr() {
        int[] arr = new int[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void TwoDToOneD() {
        /*
         *1  2  3  4  5
         *6  7  8  9  10
         *11 12 13 14 15
         *16 17 18 19 20
         *21 22 23 24 25
         */
        int[] arr = arr();
        int[][] arr2D = arr2D(arr);

        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));

    }

    private static int[][] arr2D(int[] arr) {
        int[][] arr2D = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr2D[i / 5][i % 5] = arr[i];
        }
        return arr2D;
    }

    public static void randomArr() {
        int[] arr = {7, 8, 8, 6, 2, 4, 4, 5, 7};
        System.out.println(arr.length);
        Set<Integer> set = new TreeSet<>(Arrays.stream(arr).boxed().toList());
        System.out.println("distinct");
        set.forEach(System.out::print);

        System.out.println();
        System.out.println("Just Sorted");
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;
        int nullValue = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] == Integer.MAX_VALUE) {
                nullValue++;
            }
            if (nullValue == arr.length - 1) {
                break;
            }

            if (i == arr.length - 1) {
                sb.append(min);
                min = Integer.MAX_VALUE;
                arr[minIndex] = Integer.MAX_VALUE;
                i = -1;
                nullValue = 0;
            }

        }
        System.out.println(Arrays.stream(arr).boxed().toList());
        System.out.println(sb);

    }

}
