package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


class LeetCode_6_130_1Test {

    @Test
    void solve() {
        LeetCode_6_130_1 ins = new LeetCode_6_130_1();
        /*char[][] grids1 = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}};
        ins.solve(grids1);
        System.out.println(Arrays.deepToString(grids1));


        char[][] grids2 = {
                {'O', 'O', 'O'},
                {'O', 'O', 'O'},
                {'O', 'O', 'O'}
        };
        ins.solve(grids2);
        System.out.println(Arrays.deepToString(grids2));
*/
        char[][] grids3 = {
                {'X', 'O', 'X'},
                {'X', 'O', 'X'},
                {'X', 'O', 'X'}
        };
        ins.solve(grids3);
        System.out.println(Arrays.deepToString(grids3));

    }
}