package algo.tzashinorpu.SecondRound.Chapter12;

import java.util.HashSet;

public class canCross_403 {
    private boolean can = false;

    public boolean canCross1(int[] stones) {
        // stones = [0,1,3] -> true
        // stones = [0,1,8] -> false
        // stones = [0,1,8] -> false
        dfs1(0, 0, stones);
        return this.can;
    }

    private void dfs1(int currIndex, int preK, int[] stones) {
        if (currIndex >= stones.length - 1) {
            this.can = true;
            return;
        }

        for (int i = currIndex + 1; i < Math.min(stones.length, currIndex + preK + 2); i++) {
            int gap = stones[i] - stones[currIndex];
            if (gap <= preK + 1 && gap >= preK - 1) {
                dfs1(i, gap, stones);
            }
        }
    }

    public boolean canCross2(int[] stones) {
        return dfs2(0, 0, stones);
    }

    private boolean dfs2(int currIndex, int preK, int[] stones) {
        if (currIndex >= stones.length - 1) {
            return true;
        }
        // 循环中只返回满足的条件
        for (int i = currIndex + 1; i < Math.min(stones.length, currIndex + preK + 2); i++) {
            int gap = stones[i] - stones[currIndex];
            if (gap <= preK + 1 && gap >= preK - 1) {
                if (dfs2(i, gap, stones)) {
                    return true;
                }
            }
            /* 循环中返回时不能用这种方法
            if (gap <= preK + 1 && gap >= preK - 1) {
                return dfs2(i, gap, stones);
            }*/
        }
        return currIndex >= stones.length - 1;
    }

    public boolean canCross2WithMem(int[] stones) {
        HashSet<Integer> visited = new HashSet<>();
        return dfs3(0, 0, stones, visited);
    }

    private boolean dfs3(int currIndex, int preK, int[] stones, HashSet<Integer> visited) {
        if (currIndex >= stones.length - 1) {
            return true;
        }
        if (visited.contains(1000 * currIndex + preK)) {
            return false;
        }
        visited.add(currIndex * 1000 + preK);
        for (int i = currIndex + 1; i < Math.min(stones.length, currIndex + preK + 2); i++) {
            int gap = stones[i] - stones[currIndex];
            if (gap <= preK + 1 && gap >= preK - 1) {
                if (dfs3(i, gap, stones, visited)) {
                    return true;
                }
            }
        }
        return currIndex >= stones.length - 1;
    }
}
