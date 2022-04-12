package algo.tzashinorpu.ThirdRound.Chapter07;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis_22 {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        recursive(res, "", 0, 0, n);
        return res;
    }

    private void recursive(ArrayList<String> res, String tmp, int l, int r, int n) {
        if (l == n && r == n) {
            res.add(tmp);
            return;
        }
        if (l < n) {
            recursive(res, tmp + "(", l + 1, r, n);
        }
        if (r < l) {
            recursive(res, tmp + ")", l, r + 1, n);
        }
    }
}
