package algo.tzashinorpu.ThirdRound.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class updateBoard_529Test {

    @Test
    void updateBoard() {
        updateBoard_529 ins = new updateBoard_529();
        int[] click = {3, 0};
        char[][] board = {{'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'M', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E'}};
        System.out.println(Arrays.deepToString(ins.updateBoard(board, click)));
    }
}