package org.Quiz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class CalculateMiddleValue {
    public static void main(String[] args) {
        Set<Long> logSet = new HashSet<>();
        for (long i = 0; i < 20; i++) {
            logSet.add(i);
        }


        Set<Long> set = new HashSet();
        for (long i = 0; i < 1000; i+= 10) {
            set.add(i);
            System.out.println("set = " + set);
        }

        String s = "";
        for (int i = 0; i < set.size(); i++) {
            System.out.println(set);
            System.out.println(s.equals(set.toString()));
            s = set.toString();
        }

        String as = middleValue(1, 2, 3, 4, 5, 6, 7);
        System.out.println("s = " + s);

    }//set = [1, 49, 5, 6, 7, 9, 29]
    //set = [1, 49, 5, 6, 7, 9, 29]

    public static String middleValue(Integer... numbers) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(numbers));
        Collections.sort(arr);
        while (arr.size() > 2) {
            arr.remove(arr.size() - 1);
            arr.remove(0);
        }




        return arr.toString().replace("[", "").replace("]", "");
    }
}
