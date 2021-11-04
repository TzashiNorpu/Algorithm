package algo.tzashinorpu.SecondRound.Chapter08;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class letterCombinations_017 {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = Map.of(
                '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
        );
        List<String> res = new LinkedList<>();
        if (digits.equals("")) {
            return res;
        }
        char[] chars = digits.toCharArray();
        backTrack(0, digits.length(), map, chars, "", res);
        return res;
    }

    private void backTrack(int level, int depth, Map<Character, String> map, char[] chars, String temp, List<String> res) {
        if (level == depth) {
            res.add(temp);
            return;
        }
        Character c = chars[level];
        for (char t : map.get(c).toCharArray()) {
            backTrack(level + 1, depth, map, chars, temp + t, res);
        }
    }
}
