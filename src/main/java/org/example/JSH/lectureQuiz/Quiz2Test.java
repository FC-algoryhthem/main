package org.example.JSH.lectureQuiz;

import org.junit.Test;

import static org.junit.Assert.*;

public class Quiz2Test {

    // 입력: int[][] // 5*5
    // 출력: int - 빙고의 개수
    public int bingoCount(int[][] arr) {
        int binggoCnt = 0; //빙고의 개수

        // 가로 세기
        // 한줄에서 1의 개수를 세어서 5면 cnt++
        int crossCnt = 0;
        int crossCnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int garoCnt = 0;
            int seroCnt = 0;

            if(arr[i][i] == 1) crossCnt++;
            if(arr[i][4-i] == 1) crossCnt2++;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1) garoCnt++;
                if(arr[j][i] == 1) seroCnt++;
            }
            if(garoCnt == 5) binggoCnt++;
            if(seroCnt == 5) binggoCnt++;
            if(crossCnt == 5) binggoCnt++;
            if(crossCnt2 == 5) binggoCnt++;
        }
        return binggoCnt;
    }

    @Test
    public void 가로테스트() {
        //가로 개수 세기
        int[][] arr = {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        assertTrue(bingoCount(arr) == 1);
    }

    @Test
    public void 가로테스트2() {
        //가로 개수 세기
        int[][] arr = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0}
        };
        assertTrue(bingoCount(arr) == 3);
    }

    @Test
    public void 가로테스트3() {
        //가로 개수 세기
        int[][] arr = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        assertTrue(bingoCount(arr) == 12);
    }

    @Test
    public void main() {
    }
}