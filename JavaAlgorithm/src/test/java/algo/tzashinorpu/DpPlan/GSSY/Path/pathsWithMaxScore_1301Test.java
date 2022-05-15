package algo.tzashinorpu.DpPlan.GSSY.Path;

import algo.tzashinorpu.GSSY.Path.pathsWithMaxScore_1301;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class pathsWithMaxScore_1301Test {

    @Test
    void pathsWithMaxScore() {
        pathsWithMaxScore_1301 ins = new pathsWithMaxScore_1301();
        List<String> board = new ArrayList<>(List.of(new String[]{
                "E11", "XXX", "11S"}));
        System.out.println(Arrays.toString(ins.pathsWithMaxScore(board)));
    }
}