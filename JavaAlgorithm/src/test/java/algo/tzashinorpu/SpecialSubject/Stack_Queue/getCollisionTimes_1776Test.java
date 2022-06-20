package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class getCollisionTimes_1776Test {

    @Test
    void getCollisionTimes() {
        getCollisionTimes_1776 ins = new getCollisionTimes_1776();
        int[][] cars = {
                {3, 4},
                {5, 4},
                {6, 3},
                {9, 1}
        };
        System.out.println(Arrays.toString(ins.getCollisionTimes(cars)));
    }
}