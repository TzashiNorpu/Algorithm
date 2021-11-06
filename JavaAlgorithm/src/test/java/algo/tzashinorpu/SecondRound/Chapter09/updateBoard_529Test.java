package algo.tzashinorpu.SecondRound.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class updateBoard_529Test {

    @Test
    void updateBoard() {
        char[][] board = {
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}

        };
        int[] click = {3, 0};
        updateBoard_529 instance = new updateBoard_529();
        System.out.println(Arrays.deepToString(instance.updateBoard(board, click)));
    }
}