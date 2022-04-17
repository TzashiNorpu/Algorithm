package algo.tzashinorpu.ThirdRound.Chapter09;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis_22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        _generate(res, "", 0, 0, n);
        return res;
    }

    private void _generate(List<String> res, String s, int l, int r, int n) {
        if (l == n && r == n) {
            res.add(s);
            return;
        }
        if (l < n) _generate(res, s + "(", l + 1, r, n);
        if (r < l) _generate(res, s + ")", l, r + 1, n);
    }
}
