package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class letterCombinations_17 {
    private final HashMap<Character, char[]> map = new HashMap<>() {{
        put('2', new char[]{'a', 'b', 'c'});
        put('3', new char[]{'d', 'e', 'f'});
        put('4', new char[]{'g', 'h', 'i'});
        put('5', new char[]{'j', 'k', 'l'});
        put('6', new char[]{'m', 'n', 'o'});
        put('7', new char[]{'p', 'q', 'r', 's'});
        put('8', new char[]{'t', 'u', 'v'});
        put('9', new char[]{'w', 'x', 'y', 'z'});
    }};

    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return res;
        dfs(digits, "", 0);
        return res;
    }

    private void dfs(String s, String tmp, int level) {
        if (level == s.length()) {
            res.add(tmp);
            return;
        }

        char[] chars = map.get(s.charAt(level));
        for (char c : chars) {
            dfs(s, tmp + c, level + 1);
        }
    }
}