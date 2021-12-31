package algo.tzashinorpu.SecondRound.Chapter12;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class minimumTotal_120Test {

    @Test
    void minimumTotal() {
        minimumTotal_120 ins = new minimumTotal_120();
        List<List<Integer>> list1 = new LinkedList<>(List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3)));
        System.out.println(ins.minimumTotal1(list1));
    }

}