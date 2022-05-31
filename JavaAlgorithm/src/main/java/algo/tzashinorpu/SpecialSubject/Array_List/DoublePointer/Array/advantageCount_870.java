package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class advantageCount_870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        // 降序排列
        PriorityQueue<int[]> maxq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        for (int i = 0; i < nums2.length; i++) {
            maxq.add(new int[]{i, nums2[i]});
        }
        Arrays.sort(nums1);
        int[] res = new int[nums2.length];
        int l = 0, r = nums1.length - 1;
        while (!maxq.isEmpty()) {
            int[] poll = maxq.poll();
            int index = poll[0];
            int val = poll[1];
            if (nums1[r] > val) {
                res[index] = nums1[r--];
            } else {
                res[index] = nums1[l++];
            }
        }

        return res;
    }
}
