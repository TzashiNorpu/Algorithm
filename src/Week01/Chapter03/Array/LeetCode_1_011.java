package Week01.Chapter03.Array;

public class LeetCode_1_011 {
    // https://leetcode-cn.com/problems/container-with-most-water/
    // 盛最多水的容器

    // 双指针
    private int maxArea(int[] height) {
        int k = height.length;
        int max = 0;
        for (int i = 0, j = k - 1; i < j; ) {
            // 两端较小值往里移动
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            // 此处的i/j是移动后的索引,因此要+1
            int area = (j - i + 1) * minHeight;
            System.out.printf("height=%d,width=%d,area=%d%n",minHeight,(j-i+1), area);
            max = Math.max(max, area);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        LeetCode_1_011 test = new LeetCode_1_011();
        System.out.println(test.maxArea(height));
    }
}
