package algo.tzashinorpu.ThirdRound.Chapter08;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class letterCombinations_17 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0 || digits == null) {
            return res;
        }
        Map<String, String> map = Map.of(
                "2", "abc", "3", "def", "4", "ghi", "5", "jkl",
                "6", "mno", "7", "pqrs", "8", "tuv", "9", "wxyz"
        );
        int level = 0;
        recursive(res, "", level, digits, map);
        return res;
    }

    private void recursive(List<String> res, String s, int level, String digits, Map<String, String> map) {
        if (level == digits.length()) {
            res.add(s);
            return;
        }
        String btn = String.valueOf(digits.charAt(level));
        String btnStr = map.get(btn);
        for (int i = 0; i < btnStr.length(); i++) {
            recursive(res, s + btnStr.charAt(i), level + 1, digits, map);
        }
    }
}
