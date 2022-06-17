package algo.tzashinorpu.SpecialSubject.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lengthOfLIS_300 {
    public int lengthOfLIS_1(int[] nums) {
        // edit distance
        return 0;
    }

    public int lengthOfLIS_2(int[] nums) {
        /*List<Integer> piles = new ArrayList<>(nums.length);
        for (int num : nums) {
            int pile = Collections.binarySearch(piles, num);
            if (pile < 0) pile = ~pile;
            if (pile == piles.size()) {
                piles.add(num);
            } else {
                piles.set(pile, num);
            }
        }
        return piles.size();*/
        int size = 0;
        int[] tails = new int[nums.length];
        Arrays.fill(tails, Integer.MAX_VALUE);
        for (int num : nums) {
            int l = 0, r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                // l 的左边都是 < num 的数据  则 l 即是当前元素的插入位置
                if (tails[mid] < num) l = mid + 1;
                else r = mid - 1;
            }
            tails[l] = num;
            if (l == size) size++;
        }
        return size;
    }

    public List<Integer> lengthOfLIS_3(int[] nums) {
        List<Node> piles = new ArrayList<>(nums.length);
        for (int num : nums) {
            Node node = new Node(num);
            int pile = Collections.binarySearch(piles, node);
            if (pile < 0) pile = ~pile;

            if (pile != 0) {
                node.prev = piles.get(pile - 1);
            }

            if (pile == piles.size()) {
                piles.add(node);
            } else {
                piles.set(pile, node);
            }
        }
        return extractLIS(piles);
    }

    private List<Integer> extractLIS(List<Node> piles) {
        List<Integer> result = new ArrayList<>(piles.size());
        for (Node curr = piles.isEmpty() ? null : piles.get(piles.size() - 1); curr != null; curr = curr.prev) {
            result.add(curr.val);
        }
        Collections.reverse(result);
        return result;
    }

    private static class Node implements Comparable<Node> {
        int val;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        @Override
        public int compareTo(Node that) {
            return Integer.compare(this.val, that.val);
        }
    }
}
