package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import algo.tzashinorpu.FirstRound.Chapter12.Exercise.LeetCode_5_120;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class LeetCode_5_120Test {

    @Test
    void minimumTotal() {
        List<List<Integer>> list1 = new LinkedList<>(List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3)));
        List<List<Integer>> list2 = new LinkedList<>(List.of(List.of(-1), List.of(2, 3), List.of(1, -1, 3)));
        LeetCode_5_120 ins1 = new LeetCode_5_120();
        System.out.println(ins1.minimumTotal(list1));
        LeetCode_5_120 ins2 = new LeetCode_5_120();
        System.out.println(ins2.minimumTotal(list2));
    }
}