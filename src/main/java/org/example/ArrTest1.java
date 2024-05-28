import java.util.Arrays;

public class ArrTest1 {

    public static void main(String[] args) {

        //미리 배열 틀 만들기
        int[] arr1 = new int[25];
        int[][] arr2 = new int[5][5];

        //만들어진 arr1 배열에 값 넣기
        for(int i=0; i<arr1.length; i++){
            arr1[i] = i;
        }

       for(int i=0; i<25; i++){
           arr2[i/5][i%5] = arr1[i];
       }


//        //만들어진 arr2 배열에 값 넣기
//        for(int i=0; i<5; i++){ //i는 arr2의 행
//            for(int j=0; j<5; j++){ //j는 arr2의 열
//                arr2[i][j] = arr1[i*5+j];
//            }
//        }

        System.out.println(Arrays.deepToString(arr2));

    }
}




