package org.example.JSH.inflearn;

import java.io.*;

public class $01_05_특정문자뒤집기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chrArr = br.readLine().toCharArray();
        int lt = 0, rt = chrArr.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(chrArr[lt])) lt++;
            else if (!Character.isAlphabetic(chrArr[rt])) rt--;
            else {
                char tmp = chrArr[lt];
                chrArr[lt] = chrArr[rt];
                chrArr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        bw.write(String.valueOf(chrArr));
        bw.flush();
        bw.close();
    }
}
