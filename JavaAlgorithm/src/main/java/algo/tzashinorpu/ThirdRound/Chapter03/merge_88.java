package algo.tzashinorpu.ThirdRound.Chapter03;

public class merge_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copy = new int[m];
        System.arraycopy(nums1, 0, copy, 0, m);
        int i = 0, j = 0;
        for (; i < m && j < n; ) {
            if (copy[i] < nums2[j]) {
                nums1[i + j] = copy[i];
                i++;
            } else {
                nums1[i + j] = nums2[j];
                j++;
            }
        }
//        System.out.println(i);
//        System.out.println(j);
        if (i != m) {
            System.arraycopy(copy, i, nums1, (i + j), m + n - (i + j));
        }
        if (j != n) {
            System.arraycopy(nums2, j, nums1, (i + j), m + n - (i + j));
        }
    }
}
