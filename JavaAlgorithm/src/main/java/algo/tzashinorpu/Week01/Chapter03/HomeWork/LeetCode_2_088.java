package algo.tzashinorpu.Week01.Chapter03.HomeWork;

import java.util.Arrays;

public class LeetCode_2_088 {
    // https://leetcode-cn.com/problems/merge-sorted-array/
    // 图示: https://leetcode-cn.com/problems/merge-sorted-array/solution/he-bing-liang-ge-you-xu-shu-zu-by-leetcode/

    // 合并后排序
    private void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    // 双指针  --  从前往后
    // 时间复杂度 : O(n + m)
    // 空间复杂度 : O(m)
    private void merge2(int[] nums1, int m, int[] nums2, int n) {
        // 把nums1中的前m个元素拷贝出来
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);
        // 什么两个指针指向nums1_copy和nums2
        int p1 = 0;
        int p2 = 0;
        // p指向nums
        int p = 0;
        // 对nums1_copy 和 nums2 比较排序后将结果放入nums1
        while ((p1 < m) && (p2 < n))
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];
        // 排序后剩余的元素直接进行追加
        if (p1 < m)
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
    }

    // 双指针  --  从后往前
    // 时间复杂度 : O(n + m)
    // 空间复杂度 : O(1)
    private void merge3(int[] nums1, int m, int[] nums2, int n) {
        // p1指向nums1  p2指向nums2
        int p1 = m - 1;
        int p2 = n - 1;
        // p是从后往前更新元素的位置
        int p = m + n - 1;

        while ((p1 >= 0) && (p2 >= 0))
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];

        // 将nums2中未进行比较的数据更新如nums1中
        // nums1中未进行比较的数据在原位置上,不需要重新更新
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 3, 4};
        LeetCode_2_088 test = new LeetCode_2_088();
//        algo.tzashinorpu.test.merge1(nums1, 3, nums2, 3);
//        algo.tzashinorpu.test.merge2(nums1, 3, nums2, 3);
        test.merge3(nums1, 3, nums2, 3);
        for (int anInt : nums1) {
            System.out.println(anInt);
        }
    }

}
