package org.example.JSH.lectureQuiz;

/*
세 정수 받아서 중간 크기값 반환하는 mid()를 작성하고 테스트
 */
public class Quiz1 {
    public static int mid(int a, int b, int c) {
        if (a < b) {
            if (b < c) {
                return b;
            } else {
                if(a < c) return c;
                else return a;
            }
        } else {
            if (a < c) {
                return a;
            } else {
                if(b > c) return c;
                else return b;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(mid(1,2,3));
        System.out.println(mid(1,3,10));
        System.out.println(mid(2,3,1));
    }
}
