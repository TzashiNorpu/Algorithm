package algo.tzashinorpu.SecondRound.Chapter12;

public class minWindow_076 {
    public String minWindow(String s, String t) {
        // s = "ADOBECODEBANC", t = "ABC"
        int count = t.length();
        int[] tmap = new int[256];
        for (int i = 0; i < count; i++) {
            tmap[t.charAt(i)]++;
        }
        int left = -1, right = -1;
        int start = 0;
        int len = Integer.MAX_VALUE;
        int[] smap = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            smap[c]++;
            if (smap[c] <= tmap[c]) {
                count--;
            }
            while (start <= i && count == 0) {
                char h = s.charAt(start);
                if ((--smap[h]) < tmap[h]) {
                    count++;
                }
                if (count > 0) {
                    if (len > i - start + 1) {
                        left = start;
                        right = i;
                        len = Math.min(len, right - left + 1);
                    }
                }
                start++;
            }
        }
        if (left == -1) {
            return "";
        }
        return s.substring(left, right + 1);
    }
}
