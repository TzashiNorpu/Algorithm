package algo.tzashinorpu.Daily.CN;

import java.util.LinkedList;

public class maxDepth_1614 {
    public int maxDepth(String s) {
        char[] chars = s.toCharArray();
        int cnt = 0;
        int temp = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                temp++;
                cnt = Math.max(cnt, temp);
            }
            if (chars[i] == ')') {
                temp--;
            }
        }
        return cnt;
    }
}
