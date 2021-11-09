package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import java.util.List;

public class LeetCode_5_120 {
    private int res = Integer.MAX_VALUE;

    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        dfs(0, 0, 0, row, triangle);
        return res;
    }

    private void dfs(int index, int row, int temp, int max, List<List<Integer>> triangle) {
        if (max == row) {
            this.res = Math.min(temp + triangle.get(row - 1).get(index), this.res);
            return;
        }
        int anotherIndex = index + 1 <= triangle.get(row).size() - 1 ? index + 1 : index;
        if (anotherIndex != index) {
            dfs(anotherIndex, row + 1, triangle.get(row).get(anotherIndex) + temp, max, triangle);
        }
        dfs(index, row + 1, triangle.get(row).get(index) + temp, max, triangle);
    }
}
