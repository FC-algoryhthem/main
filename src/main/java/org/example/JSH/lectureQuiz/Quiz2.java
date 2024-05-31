package org.example.JSH.lectureQuiz;
/*
5*5 배열을 받아서 빙고개수를 반환하는 bingoCnt()를 작성 및 TEST
 */
public class Quiz2 {
    public static int bingoCnt(int[][] board) {
        int cnt = 0;
        int cross = 0;
        //4,0 3,1 2,2 1,3 0,4
        for (int i = 0; i < 5; i++) {
            int row = 0, col = 0;
            for (int j = 0; j < 5; j++) {
                if(board[i][j] == 1) row++;
                if(board[j][i] == 1) col++;
                if(row == 5) cnt ++;
                if(col == 5) cnt ++;
            }
            if(board[i][i] == 1) cross++;
            if(board[4-i][i] == 1) cross++;
        }
        cnt += cross / 5;
        return cnt;
    }
    public static void main(String[] args) {
        int[][] b1 = {
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
        int[][] b2 = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {1, 0, 1, 0, 0},
        };
        int[][] b3 = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},

        };
        System.out.println(bingoCnt(b1));
        System.out.println(bingoCnt(b2));
        System.out.println(bingoCnt(b3));
    }
}
