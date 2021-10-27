package algo.tzashinorpu.Week03.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_3_529_2Test {

    @Test
    void updateBoard() {
        LeetCode_3_529_2 instance = new LeetCode_3_529_2();
        char[][] board = {{'E', 'E', 'E', 'E', 'E' },
                {'E', 'E', 'M', 'E', 'E' },
                {'E', 'E', 'E', 'E', 'E' },
                {'E', 'E', 'E', 'E', 'E' }
        };
        int[] click = {3, 0};
        instance.updateBoard(board, click);
        System.out.println(Arrays.deepToString(board));
    }
}