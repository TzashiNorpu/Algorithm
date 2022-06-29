package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class setZeroes_73Test {

    @Test
    void setZeroes() {
        setZeroes_73 ins = new setZeroes_73();
        /*int[][] matrix1 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        ins.setZeroes(matrix1);*/
        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 0, 7, 8},
                {0, 10, 11, 12},
                {13, 14, 15, 0}
        };
        ins.setZeroes(matrix2);
    }
}