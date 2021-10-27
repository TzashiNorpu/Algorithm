package algo.tzashinorpu.FirstRound.Chapter03.Array;

public class LeetCode_1_011 {
    // https://leetcode-cn.com/problems/container-with-most-water/
    // 盛最多水的容器
    // 双指针
    private int maxArea(int[] height) {
        int maxArea = 0;
        for (int l_index = 0, r_index = height.length - 1; l_index < r_index; ) {
            // 两端较小值往里移动
            int minHeight = height[l_index] < height[r_index] ? height[l_index++] : height[r_index--];
            // 此处的 r_index/l_index 是移动后的索引,因此要 +1
            int area = (r_index - l_index + 1) * minHeight;
            System.out.printf("height=%d,width=%d,area=%d%n", minHeight, (r_index - l_index + 1), area);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        LeetCode_1_011 test = new LeetCode_1_011();
        System.out.println(test.maxArea(height));
    }
}
