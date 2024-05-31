package org.Quiz;

import java.util.ArrayList;
import java.util.List;

public class Bingo {
    public static void main(String[] args) {
        List<String> bingoBoard = new ArrayList<>();
        Bingo bingo = new Bingo(bingoBoard,5);
        bingo.createTopHorizontalBingo();
        bingo.createSemiTopHorizontalBingo();
        bingo.createMiddleHorizontalBingo();
        bingo.createSemiBottomHorizontalBingo();
        bingo.createBottomHorizontalBingo();
        bingo.createLeftVerticalBingo();
        bingo.createSemiLeftVerticalBingo();
        bingo.createMiddleVerticalBingo();
        bingo.createSemiRightVerticalBingo();
        bingo.createRightVerticalBingo();
        bingo.createBackSlashBingo();
        bingo.createSlashBingo();

        System.out.println(Integer.valueOf("10") + 2);

    }

    private final int wh;
    private List<String> bingo;

    public Bingo(List<String> bingo, int wh) {
        this.bingo = bingo;
        this.wh = wh;
    }

    public void createTopHorizontalBingo() {
        System.out.println("Bingo.createTopBingo");
        bingo.clear();
        for (int i = 0; i < wh * wh; i++) {
            if (i / wh == 0) {
                bingo.add(" * ");
            }
            if (i / wh != 0) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }
    }
    public void createSemiTopHorizontalBingo() {
        System.out.println("Bingo.createSemiTopHorizontalBingo");
        bingo.clear();
        for (int i = 0; i < wh * wh; i++) {
            if (i / wh == 1) {
                bingo.add(" * ");
            }
            if (i / wh != 1) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }
    }

    public void createMiddleHorizontalBingo() {
        System.out.println("Bingo.createMiddleHorizontalBingo");
        bingo.clear();
        for (int i = 0; i < wh * wh; i++) {
            if (i / wh == 2) {
                bingo.add(" * ");
            }
            if (i / wh != 2) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }


    }


    public void createSemiBottomHorizontalBingo() {
        System.out.println("Bingo.createSemiBottomHorizontalBingo");
        bingo.clear();
        //15, 16, 17, 18, 19
        for (int i = 0; i < wh * wh; i++) {
            if (i / wh == 3) {
                bingo.add(" * ");

            }

            if (i / wh != 3) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }
    }

    public void createBottomHorizontalBingo() {
        System.out.println("Bingo.createBottomBingo");
        bingo.clear();
        for (int i = 0; i < wh * wh; i++) {
            if (i / wh >= 4 ) {
                bingo.add(" * ");
            }
            if (i / wh < 4) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }

    }

    public void createLeftVerticalBingo() {
        System.out.println("Bingo.createLeftVerticalBingo");
        bingo.clear();
        for (int i = 0; i < wh * wh; i++) {
            if (i % wh == 0) {
                bingo.add(" * ");
            }
            if (i % wh != 0) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }

    }
    public void createSemiLeftVerticalBingo() {
        System.out.println("Bingo.createLeftVerticalBingo");
        bingo.clear();
        for (int i = 0; i < wh * wh; i++) {
            if (i % wh == 1) {
                bingo.add(" * ");
            }
            if (i % wh != 1) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }

    }
    public void createSemiRightVerticalBingo() {
        System.out.println("Bingo.createRightVerticalBingo");
        bingo.clear();
        for (int i = 0; i < wh * wh; i++) {
            if (i % (wh) == 3) {
                bingo.add(" * ");
            }
            if (i % (wh) != 3) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }
    }
    public void createRightVerticalBingo() {
        System.out.println("Bingo.createRightVerticalBingo");
        bingo.clear();
        for (int i = 0; i < wh * wh; i++) {
            if (i % (wh) == 4) {
                bingo.add(" * ");
            }
            if (i % (wh) != 4) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }
    }

    public void createMiddleVerticalBingo() {
        System.out.println("Bingo.createMiddleVerticalBingo");
        bingo.clear();
        for (int i = 0; i < wh * wh; i++) {
            if (i % (wh) == 2) {
                bingo.add(" * ");
            }
            if (i % (wh) != 2) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }

    }

    public void createBackSlashBingo() {
        System.out.println("Bingo.createBackSlashBingo");
        bingo.clear();
        //0, 6, 12, 18
        for (int i = 0; i < wh * wh; i++) {
            if (i % (wh + 1) == 0) {
                bingo.add(" * ");
            }
            if (i % (wh + 1) != 0) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }

    }
    public void createSlashBingo() {
        System.out.println("Bingo.createSlashBingo");
        bingo.clear();
        //0, 6, 12, 18
        for (int i = 0; i < wh * wh; i++) {
            if (i % (wh - 1) == 0 && i != 0 || i != bingo.size()) {
                bingo.add(" * ");
            }
            if (i % (wh - 1) != 0) {
                bingo.add("   ");
            }
        }

        for (int i = 0; i < wh; i++) {
            for (int j = 0; j < wh; j++) {
                System.out.print(bingo.get((wh * i) + j));
            }
            System.out.println();
        }

    }

}
