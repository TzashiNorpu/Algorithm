package algo.tzashinorpu.FirstRound.Chapter03.HomeWork;

import java.util.Arrays;

public class LeetCode_2_088_1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ints = Arrays.copyOf(nums1, m);
        for (int i = 0,l1=0,l2=0; i < m + n; i++) {
            if (l1 == m) {
                nums1[i] = nums2[l2++];
            } else if (l2 == n) {
                nums1[i] = ints[l1++];
            } else {
                nums1[i] = ints[l1]<nums2[l2]?ints[l1++] :nums2[l2++];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,0,0,0};
        int[] nums2 = {2,5,6};
        LeetCode_2_088_1 sol = new LeetCode_2_088_1();
        sol.merge(nums1,2,nums2,3);
        for (int e :
                nums1) {
            System.out.println(e);
        }
    }
}
