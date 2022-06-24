package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class longestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            // 第一个不是以数组第一个字符串开始的元素  找到这个元素和第一个元素的最大公共前缀  -> 一次往后
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
        return pre;
    }
}
