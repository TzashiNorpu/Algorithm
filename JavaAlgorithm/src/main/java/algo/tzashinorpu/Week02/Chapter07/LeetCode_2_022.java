package algo.tzashinorpu.Week02.Chapter07;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_022 {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        _generate(0,0,  n, "");
        return res;
    }

    private void _generate(int left, int right, int max, String s) {
        // terminator
        if (left == right && left == max) {
            res.add(s);
            System.out.println(s);
            return;
        }
        // process

        // drill down
        if (left <= max) {
            _generate(left+1,right,max,s+"(");
        }
        if (right < left) {
            _generate(left,right+1,max,s+")");
        }
        // restore
    }

    private void _generate(int level, int max, String s) {
        // terminator
        if (level == max) {
            System.out.println(s);
            return;
        }
        // process

        // drill down
        _generate(level+1,max,s+"(");
        _generate(level+1,max,s+")");
        // restore

    }

    public static void main(String[] args) {
        LeetCode_2_022 test = new LeetCode_2_022();
        test.generateParenthesis(3);
    }
}
