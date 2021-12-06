package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LeetCode_5_403 {
    private boolean can = false;

    public boolean canCross1(int[] stones) {
        /*输入：stones = [0,1,3,5,6,8,12,17]
        输出：true*/
        // 数组存放有石块的索引位置
        // 第一步只能跳跃一个单位
        // 上一步跳跃了 k 个单位，那么它接下来的跳跃距离只能选择为 k - 1、k 或 k + 1 个单位
        // 第一步只能跳跃一个单位,第二步 0 1 2
        Map<Integer, Integer> visited = new HashMap<>();
        helper(stones, 0, 1, 1, visited);
        return this.can;
    }

    private void helper(int[] stones, int preIndex, int currIndex, int preStep, Map<Integer, Integer> visited) {
        if (visited.containsKey(currIndex) && visited.get(currIndex) == preStep) {
            return;
        }
        if (currIndex >= stones.length) {
            return;
        }
        if (stones[currIndex] != stones[preIndex] + preStep) {
            return;
        }
        if (stones.length - 1 == currIndex) {
            this.can = true;
            return;
        }
        visited.put(currIndex, preStep);
        for (int i = 1; i < stones.length - preIndex; i++) {
            helper(stones, currIndex, currIndex + i, preStep - 1, visited);
            helper(stones, currIndex, currIndex + i, preStep, visited);
            helper(stones, currIndex, currIndex + i, preStep + 1, visited);
        }
    }

    public boolean canCross2(int[] stones) {
        HashSet<Integer> visited = new HashSet<>();
        return helper2(stones, 1, 1, visited);
    }

    private boolean helper2(int[] stones, int index, int k, HashSet<Integer> visited) {
        int key = index * 1000 + k;
        if (visited.contains(key)) {
            return false;
        } else {
            visited.add(key);
        }

        // stones = [0,1,3,5,6,8,12,17]
        // stones[3] = 5  k=3 stones[5] = 8
//        for (int i = index + 1; i < stones.length; i++) {
        int rIndex = Math.min(index + k + 1, stones.length - 1);
        for (int i = index + 1; i <= rIndex; i++) {
            int gap = stones[i] - stones[index];
            if (gap >= k - 1 && gap <= k + 1) {
                if (helper2(stones, i, gap, visited)) {
                    return true;
                }
            } else if (gap > k + 1) {
                break;
            }
        }
        return index == stones.length - 1;
    }
}
