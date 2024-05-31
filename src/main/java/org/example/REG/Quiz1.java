package test0;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 세 정수 받아서 중간 크기 값 반환하는 mid()를 작성하고 Test하기
 *
 * **/




public class Quiz1 {

    int mid(int[] arr){
        int answer = 0;
        Arrays.sort(arr); // 중간값 알기위해 오름차순 정렬
        answer = arr[1]; // 3개 중에 당연히 2번째 있는게 중간 값55

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("정수 3개를 입력하세요");
        int[] arr = new int[3]; // 문제 자체가 3개의 정수라고 콕집어서 말했으니 크기3짜리 배열 그냥 만들어 줬음
        Quiz1 q = new Quiz1();

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(q.mid(arr));
    }
}





