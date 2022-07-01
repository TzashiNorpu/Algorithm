package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.ArrayList;
import java.util.List;

public class generate_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows > 0) {
            res.add(new ArrayList<>(List.of(1)));
        }
        if (numRows > 1) {
            res.add(new ArrayList<>(List.of(1, 1)));
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            List<Integer> list = res.get(i - 1);
            for (int j = 0; j < list.size() - 1; j++) {
                tmp.add(list.get(j) + list.get(j + 1));
            }
            tmp.add(1);
            res.add(tmp);
        }
        return res;
    }
}
