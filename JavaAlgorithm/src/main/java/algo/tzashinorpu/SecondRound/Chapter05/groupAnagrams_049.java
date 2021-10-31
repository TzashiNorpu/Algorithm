package algo.tzashinorpu.SecondRound.Chapter05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams_049 {
    public List<List<String>> groupAnagrams(String[] strs) {
       /* 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
        输出: [["bat"],["nat","tan"],["ate","eat","tea"]]*/
        HashMap<String, List<String>> countMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {

            /*char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String s = new String(temp);*/

            String s = calcKey(strs[i]);
            countMap.putIfAbsent(s, new ArrayList<>());
            countMap.get(s).add(strs[i]);
        }
        return new ArrayList<List<String>>(countMap.values());
    }

    private String calcKey(String str) {
        char[] chars = new char[26];
        for (int i = 0; i < str.length(); i++) {
            chars[str.charAt(i) - 'a']++;
        }
        return new String(chars);
    }
}
