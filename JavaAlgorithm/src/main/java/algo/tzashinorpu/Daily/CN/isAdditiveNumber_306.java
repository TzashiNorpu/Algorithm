package algo.tzashinorpu.Daily.CN;

public class isAdditiveNumber_306 {
    // "112233123"
    public boolean isAdditiveNumber(String num) {
        return dfs(0, 0, 0, 0, num);
    }

    private boolean dfs(int index, int count, long prevprev, long prev, String num) {
        // index 是第三个数字的位置
        // prevprev 是第一个数字的值
        // prev 是第二个数字的值
        if (index >= num.length()) {
            return count > 2;
        }
        long curr = 0;
        for (int i = index; i < num.length(); i++) {
            // 不能做为前导0，但是它自己是可以单独做为0来使用的
            if (num.charAt(index) == '0' && i > index) {
                return false;
            }
            curr = curr * 10 + (num.charAt(i) - '0');
            if (count >= 2) {
                long sum = prev + prevprev;
                if (curr > sum) {
                    // 回退到上一层 第三层到第二个数那一层
                    return false;
                }
                if (curr < sum) {
                    // 增加当前层数字的位数  第一位 第二位 第三位都是这个逻辑
                    continue;
                }
            }
            // 相等时向下探一层
            // i+1是新的第三个数
            if (dfs(i + 1, count + 1, prev, curr, num)) {
                return true;
            }
        }
        return false;
    }

}
