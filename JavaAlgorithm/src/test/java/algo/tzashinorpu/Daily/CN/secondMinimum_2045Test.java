package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class secondMinimum_2045Test {

    @Test
    void secondMinimum() {
        secondMinimum_2045 ins = new secondMinimum_2045();
        int n1 = 5;
        int[][] edges1 = {{1, 2}, {1, 3}, {1, 4}, {3, 4}, {4, 5}};
        int time1 = 3;
        int change1 = 5;
        System.out.println(ins.secondMinimum(n1, edges1, time1, change1));

        int n2 = 2;
        int[][] edges2 = {{1, 2}};
        int time2 = 3;
        int change2 = 2;
        System.out.println(ins.secondMinimum(n2, edges2, time2, change2));

        int n3 = 2;
        int[][] edges3 = {{1, 2}};
        int time3 = 2;
        int change3 = 1;
        System.out.println(ins.secondMinimum(n3, edges3, time3, change3));

        int n4 = 2;
        int[][] edges4 = {{1, 2}};
        int time4 = 1;
        int change4 = 2;
        System.out.println(ins.secondMinimum(n4, edges4, time4, change4));


    }
}