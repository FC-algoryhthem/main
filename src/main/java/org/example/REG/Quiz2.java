package test0;

import java.util.Scanner;

/***
 *
 * 5x5배열을 받아서 빙고개수를 반환하는 bingoCnt()를 작성하고 테스트
 *
 * ***/

class Bingo{
    int[][] bingo; //초기값 null
    int len;


    int[][] makeBingo(int n){
        this.bingo = new int[n][n]; // makeBingo해주면 new로 배열하나 만들어주고 걔 주소값을 bingo로 저장

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                bingo[i][j]=(5*i)+(j+1);
            }
        }// 여기까지가 단순 1~25까지 수를 집어넣은거

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int x = (int)(Math.random()*5);
                int y = (int)(Math.random()*5);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[y][y];
                bingo[y][y] = tmp;
            }
        }// 빙고하기위해 막 섞어줌

        return bingo;// 내가 만든 빙고판이 저장된 주소 리턴
    }


    void showBingo(){
        System.out.println("빙고판의 현재 상태입니다");
        for(int i=0; i<bingo.length; i++){
            for(int j=0; j<bingo[i].length; j++){
                if(bingo[i][j]<10){ // 숫자가 한자릿수면 앞에 한 칸 띄워줘서 칸 예쁘게
                    System.out.print("[ "+bingo[i][j]+"]");
                }else{
                    System.out.print("["+bingo[i][j]+"]");
                }
            }
            System.out.println();
        }
    }


    int checkBingo(int number, int count){
        int check_bingo = 0;

        loop1: for(int i1=0; i1<len; i1++) { // 동그라미(0) 그려주기
            for (int j1 = 0; j1 < len; j1++) {
                if (bingo[i1][j1] == number) {
                    bingo[i1][j1] = 0;
                    break loop1;
                }
            }
        }

        if(count>=len){ //count len이상 일때만 빙고 완성됐는지 확인
            for(int i2=0; i2<len; i2++){ // 가로 방향으로 빙고 있나 찾기
                for(int j2=0; j2<len; j2++){
                    if(!(bingo[i2][j2]==0)) break;
                    if(j2==len-1) check_bingo++;
                }
            }

            for(int i3=0; i3<len; i3++){ // 세로 방향으로 빙고 있나 찾기
                for(int j3=0; j3<len; j3++){
                    if(!(bingo[j3][i3]==0)) break;
                    if(j3==len-1) check_bingo++;
                }
            }

            for(int i4=0; i4<len; i4++){ // 대각선 방향으로 빙고 있나 찾기
                if(!(bingo[i4][i4]==0)) break;
                if(i4==len-1) check_bingo++;
            }

            for(int i5=0; i5<len; i5++){ // 대각선 방향으로 빙고 있나 찾기
                if(!(bingo[i5][4-i5]==0)) break;
                if(i5==len-1) check_bingo++;
            }
        }

    return check_bingo;

    }
}




public class Quiz2{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("빙고판의 크기를 설정하세요");
    int len = sc.nextInt(); // 빙고판 크기는 사용자가 결정

    Bingo mybingo = new Bingo(); //Bingo클래스안에 있는 멤버들 사용하려면 Bingo객체 생성
    mybingo.len = len;

    mybingo.makeBingo(len);
    mybingo.showBingo();

    System.out.println("최대 숫자 범위를 넘어가지 않는 선에서 숫자를 한글자씩 불러주세요");

    int max_count = len*len;
    for(int i=1; i<=max_count; i++){
        int a = sc.nextInt(); // 값을 입력하면

        System.out.println("현재 빙고"+mybingo.checkBingo(a,i)+"개 달성");//checkBingo메서드가 해당 숫자에 동그라미 그려주고 현재 빙고 몇개인지 세줌
        mybingo.showBingo(); //현재상태 보여주기
        System.out.println();

    }


    }
}