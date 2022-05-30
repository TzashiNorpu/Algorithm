package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.String;

import java.util.HashMap;

public class minWindow_76 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>(), window = new HashMap<>();
        for (char c : t.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);

        int left = 0, right = 0;
        int valid = 0;

        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            // c 是将移⼊窗⼝的字符
            char c = s.charAt(right);
            // 增⼤窗⼝
            right++;
            // 进⾏窗⼝内数据的⼀系列更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (need.get(c).equals(window.get(c))) valid++;
            }
            /*** debug 输出的位置 ***/
            System.out.printf("window: [%d, %d)\n", left, right);
            /********************/

            // 判断左侧窗⼝是否要收缩
//            while (window needs shrink){
            while (need.size() == valid) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // d 是将移出窗⼝的字符
                char d = s.charAt(left);
                // 缩⼩窗⼝
                left++;
                // 进⾏窗⼝内数据的⼀系列更新
                if (need.containsKey(d)) {
                    window.put(d, window.getOrDefault(d, 0) - 1);
                    if (window.get(d) < need.get(d)) valid--;
                }
            }
        }
        // 索引
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
