package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exist_79Test {

    @Test
    void exist() {
        exist_79 ins = new exist_79();
        char[][] board1 = new char[][]{
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A', 'A'}
        };
        String word1 = "AAAAAAAAAAAAAAB";
        System.out.println(ins.exist(board1, word1));
    }
}