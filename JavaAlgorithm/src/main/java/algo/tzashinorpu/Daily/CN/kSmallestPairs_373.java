package algo.tzashinorpu.Daily.CN;

import java.util.*;

public class kSmallestPairs_373 {
    public List<List<Integer>> kSmallestPairsSmallHeap(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> nums1[a[0]] + nums2[a[1]]));
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            for (int j = 0; j < Math.min(nums2.length, k); j++) {
                pq.add(new int[]{i, j});
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (!pq.isEmpty()) {
                int[] poll = pq.poll();
                res.add(Arrays.asList(nums1[poll[0]], nums2[poll[1]]));
            }
        }
        return res;
    }

    private boolean flag = true;

    public List<List<Integer>> kSmallestPairsMerge(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        // 交换后 flag 为 false
        if (n > m && !(flag = false)) return kSmallestPairsMerge(nums2, nums1, k);
        // pq 中先放置 nums1/nums2 中较短的数组的索引
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> nums1[a[0]] + nums2[a[1]]));
        for (int i = 0; i < Math.min(n, k); i++) {
            pq.add(new int[]{i, 0});
        }
        List<List<Integer>> res = new ArrayList<>();
        while (res.size() < k && !pq.isEmpty()) {
            int[] poll = pq.poll();
            int a = poll[0];
            int b = poll[1];
            res.add(new ArrayList<>() {
                {
                    add(flag ? nums1[a] : nums2[b]);
                    add(flag ? nums2[b] : nums1[a]);
                }
            });
//            首次取出的二元组为 (0,0)，即点对 (nums1[0],nums2[0])，
//            取完后将序列的下一位点对 (nums1[0],nums2[1]) 以二元组 (0,1) 形式放入优先队列
            if (b + 1 < m) {
                pq.add(new int[]{a, b + 1});
            }
        }
        return res;
    }
}
