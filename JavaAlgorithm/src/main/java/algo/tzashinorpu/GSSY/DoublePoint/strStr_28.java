package algo.tzashinorpu.GSSY.DoublePoint;

public class strStr_28 {
    public int strStr(String haystack, String needle) {
        int pos = 0;
        if (needle.equals("")) return pos;
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len1 < len2) return -1;
        for (int i = 0; i < len1 - len2; i++) {
            if (haystack.substring(i, i + len2).equals(needle)) return i;
        }
        return pos;
    }
}
