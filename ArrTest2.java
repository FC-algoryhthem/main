import java.util.Arrays;

public class ArrTest2 {

    public static void main(String[] args) {

    //미리 5x5짜리 2차원배열 생성
    int[][] arr2 = {
            {0,1,2,3,4},
            {5,6,7,8,9},
            {10,11,12,13,14},
            {15,16,17,18,19},
            {20,21,22,23,24}
    };

    //2차원배열을 1차원 배열로 만들기 전에 1차원 배열 틀 생성
    int[] arr1 = new int[25];


    for(int i=0; i<25; i++){
        arr1[i] = arr2[i/5][i%5];
    }


//    //이제 arr1에 값 넣기
//    for(int i=0; i<5; i++){
//        for(int j=0; j<5; j++){
//            arr1[(5*i)+j] = arr2[i][j];
//        }
//    }



    System.out.println(Arrays.deepToString(arr2));
    System.out.println(Arrays.toString(arr1));


    }
}
