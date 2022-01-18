package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class findMinDifference_539Test {

    @Test
    void findMinDifference() {
        findMinDifference_539 ins = new findMinDifference_539();
        List<String> list1 = new ArrayList<>(Arrays.asList("00:00", "00:04", "00:59", "23:57"));
        System.out.println(ins.findMinDifference(list1));
        List<String> list2 = new ArrayList<>(Arrays.asList("12:12", "12:13"));
        System.out.println(ins.findMinDifference(list2));

    }
}