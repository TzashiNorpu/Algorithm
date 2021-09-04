package algo.tzashinorpu.Week02.Chapter05;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_2_242 {
    // https://leetcode-cn.com/problems/valid-anagram/description/
    public boolean isAnagram1(String s, String t) {
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen) {
            return false;
        }

        for (int i = 0; i < sLen; i++) {
            sCount[s.charAt(i)-'a'] += 1;
            tCount[t.charAt(i)-'a'] +=1;
        }
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr,tArr);
    }
    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i) - 'a', count.getOrDefault(s.charAt(i) - 'a', 0)+1);
            count.put(t.charAt(i) - 'a', count.getOrDefault(t.charAt(i) - 'a', 0)-1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)-'a') != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        LeetCode_2_242 sol = new LeetCode_2_242();
        System.out.println(sol.isAnagram3("abc", "abc"));
    }
}
