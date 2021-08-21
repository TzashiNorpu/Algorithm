package algo.tzashinorpu.Week01.Chapter03.Array;

public class LeetCode_1_011_1 {
    // double loop
    /*public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
*/
    // double point
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int h = height[i] > height[j] ? height[j--] : height[i++];
            int area = (j - i + 1) * h;
            if (area > maxArea) {
                maxArea = area;
            }
            /*if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }*/
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] heights = {1, 1};
        LeetCode_1_011_1 solution = new LeetCode_1_011_1();
        int maxArea = solution.maxArea(heights);
        System.out.println(maxArea);
    }
}
