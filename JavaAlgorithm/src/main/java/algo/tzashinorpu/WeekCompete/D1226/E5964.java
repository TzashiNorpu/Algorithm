package algo.tzashinorpu.WeekCompete.D1226;

import java.util.HashMap;

public class E5964 {
    private int[] res;

    public int[] executeInstructions(int n, int[] startPos, String s) {
        int length = s.length();
        res = new int[length];
        HashMap<Character, int[]> m = new HashMap<>() {
            {
                put('R', new int[]{0, 1});
                put('L', new int[]{0, -1});
                put('D', new int[]{1, 0});
                put('U', new int[]{-1, 0});
            }
        };
        for (int i = 0; i < length; i++) {
            char[] instrs = s.substring(i).toCharArray();
            dfs(i, startPos[0], startPos[1], 0, instrs, m, n);
        }

        return res;
    }

    private void dfs(int strartIndex, int x, int y, int index, char[] instrs, HashMap<Character, int[]> m, int n) {
        if (invalidPos(x, y, n)) {
            this.res[strartIndex] = index - 1;
            return;
        }
        if (index == instrs.length) {
            this.res[strartIndex] = index;
            return;
        }
        int[] dir = m.get(instrs[index]);
        dfs(strartIndex, x + dir[0], y + dir[1], index + 1, instrs, m, n);
    }

    private boolean invalidPos(int x, int y, int n) {
        return x < 0 || x >= n || y < 0 || y >= n;
    }
}
