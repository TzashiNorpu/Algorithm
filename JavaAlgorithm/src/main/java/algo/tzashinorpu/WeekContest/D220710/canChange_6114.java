package algo.tzashinorpu.WeekContest.D220710;

public class canChange_6114 {
    public boolean canChange(String start, String target) {
        /*
        双指针遍历 start[i] 和 target[j]，分类讨论：
        如果当前字符为 L 且 i<j，那么这个 L 由于无法向右移动，返回 false；
        如果当前字符为 R 且 i>j，那么这个 R 由于无法向左移动，返回 false。
         */
        if (!start.replace("_", "").equals(target.replace(" ", ""))) {
            return false;
        }
        for (int i = 0, j = 0; i < start.length(); i++) {
            if (start.charAt(i) == '_') continue;
            while (target.charAt(j) == '_') j++;
            if (i != j && start.charAt(i) == 'L' && i < j) return false;
            if (i != j && start.charAt(i) == 'R' && i > j) return false;
            j++;
        }
        return true;
    }
}
