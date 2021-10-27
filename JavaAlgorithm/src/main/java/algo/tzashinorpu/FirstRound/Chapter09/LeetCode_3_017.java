package algo.tzashinorpu.FirstRound.Chapter09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode_3_017 {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>();
        if (digits == null || digits.equals("")) {
            return res;
        }
        // ["2","3"]
        String[] split = digits.split("");
        HashMap<String, String[]> mappings = new HashMap<>();
        mappings.put("2", new String[]{"a", "b"/*, "c"*/});
        mappings.put("3", new String[]{"d", "e"/*, "f"*/});
        mappings.put("4", new String[]{"g", "h"/*, "i"*/});
        mappings.put("5", new String[]{"j", "k", "l"});
        mappings.put("6", new String[]{"m", "n", "o"});
        mappings.put("7", new String[]{"p", "q", "r", "s"});
        mappings.put("8", new String[]{"t", "u", "v"});
        mappings.put("9", new String[]{"w", "x", "y", "z"});
//        dfs(split, 0, mappings, "", res);
        backTrack(split, 0, new StringBuilder(), res, mappings);
        return res;
    }

    private void backTrack(String[] split, int index, StringBuilder stringBuilder, ArrayList<String> res, HashMap<String, String[]> mappings) {
        if (index == split.length) {
            res.add(stringBuilder.toString());
            return;
        }
        String[] strings = mappings.get(split[index]);
        int length = strings.length;
        for (int i = 0; i < length; i++) {
            String s = strings[i];
            backTrack(split, index + 1, stringBuilder.append(s), res, mappings);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    private void dfs(String[] split, int level, HashMap<String, String[]> mappings, String combination, ArrayList<String> res) {
        if (level == split.length) {
//            System.out.println(combination);
            res.add(combination);
            return;
        }
        int length = mappings.get(split[level]).length;
        for (int i = 0; i < length; i++) {
            // String类型做拼接效率会比较低
            dfs(split, level + 1, mappings, combination.concat(mappings.get(split[level])[i]), res);
        }
    }
}
