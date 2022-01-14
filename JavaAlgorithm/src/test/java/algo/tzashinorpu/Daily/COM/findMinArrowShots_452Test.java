package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findMinArrowShots_452Test {

    @Test
    void findMinArrowShots() {
        findMinArrowShots_452 ins = new findMinArrowShots_452();
        int[][] points1 = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(ins.findMinArrowShots(points1));

        int[][] points2 = {
                {-2147483646, -2147483645},
                {2147483646, 2147483647}
        };
        System.out.println(ins.findMinArrowShots(points2));

        int[][] points3 = {{0, 9}, {1, 8}, {7, 8}, {1, 6}, {9, 16}, {7, 13}, {7, 10}, {6, 11}, {6, 9}, {9, 13}};
        System.out.println(ins.findMinArrowShots(points3));
    }
}