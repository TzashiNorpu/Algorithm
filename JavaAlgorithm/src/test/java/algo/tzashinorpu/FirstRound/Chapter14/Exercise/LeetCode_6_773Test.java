package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_6_773Test {

    @Test
    void slidingPuzzle() {
        LeetCode_6_773 ins = new LeetCode_6_773();
        int[][] board1 = {{1, 2, 3}, {4, 0, 5}};
        System.out.println(ins.slidingPuzzle(board1));

        int[][] board2 = {{4, 1, 2}, {5, 0, 3}};
        System.out.println(ins.slidingPuzzle(board2));


        int[][] board3 = {{1, 2, 3}, {5, 4, 0}};
        System.out.println(ins.slidingPuzzle(board3));
    }
}