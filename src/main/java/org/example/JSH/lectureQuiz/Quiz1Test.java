package org.example.JSH.lectureQuiz;

import org.junit.Test;

import static org.junit.Assert.*;

public class Quiz1Test {
    public int mid(int x, int y, int z) {
        if ((x <= y && y <= z) || (z <= y && y <= x)) {return y;}
        if ((y <= x && x <= z) || (z <= x && x <= y)) {return x;}

        return z;
    }

    @Test
    public void test() {assertTrue(mid(1,2,3)==2);}
    @Test
    public void test1() {assertTrue(mid(1,1,1)==1);}
    @Test
    public void test2() {assertTrue(mid(2,3,1)==2);}
    @Test
    public void test3() {assertTrue(mid(3,1,2)==2);}
    @Test
    public void test4() {assertTrue(mid(1,1,2)==1);}
}