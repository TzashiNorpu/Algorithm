package algo.tzashinorpu.Daily.CN;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class LeetCode_846 {
    public boolean isNStraightHand1(int[] hand, int groupSize) {
        // 找到每 k 个一组的连续值(确定每k个的最小值，并判断这k个值是否连续)
        if (hand.length % groupSize != 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        for (int i = 0; i < hand.length; i++) {
            queue.offer(hand[i]);
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }
        while (!queue.isEmpty()) {
            Integer begin = queue.poll();
            // 1,2,2,3,3,4
            // map 匹配上一个队列里已经出队列的元素时跳过
            if (map.getOrDefault(begin, 0) == 0) continue;
            for (int i = 0; i < groupSize; i++) {
                Integer cnt = map.getOrDefault(begin + i, 0);
                if (cnt == 0) return false;
                map.put(begin + i, cnt - 1);
            }
        }
        return true;
    }

    public boolean isNStraightHand2(int[] hand, int groupSize) {
        if (groupSize == 1) {
            return true;
        }
        int length = hand.length;
        if (length % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        boolean[] visited = new boolean[length];
        int startIndex = 0;
        int prevIndex = startIndex;
        int curIndex = prevIndex + 1;
        while (startIndex < length) {
            // 找到最小的没被访问的位置
            if (visited[startIndex]) {
                startIndex++;
                continue;
            }
            prevIndex = startIndex;
            curIndex = prevIndex + 1;
            // 找到以这个位置为起点的一副排
            int cnt = 0; // 统计排的数量
            // 1,2,2,3,3,4
            while (curIndex < length) {
                if (!visited[curIndex] && hand[curIndex] == hand[prevIndex] + 1) {
                    visited[curIndex] = true;
                    visited[prevIndex] = true;
                    prevIndex = curIndex;
                    curIndex++;
                    // 完成一次排序
                    if ((++cnt) == groupSize - 1) break;
                } else {
                    curIndex++;
                }
            }
            // 数量不足  则失败
            if (cnt != groupSize - 1) {
                return false;
            }
        }
        return true;
    }
}
