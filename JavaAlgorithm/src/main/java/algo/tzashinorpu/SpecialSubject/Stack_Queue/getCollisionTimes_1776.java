package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class getCollisionTimes_1776 {
    public double[] getCollisionTimes(int[][] cars) {
        /*
        [[3,4],[5,4],[6,3],[9,1]] -> [2.00000,1.00000,1.50000,-1.00000]
        [3,4] 2秒后：3+4*2=11=9+1*2=11
        [5,4] 1秒后：5+4*1=9=6+3*1=9
        [6,3] 1.5秒后：6+3*1.5=10.5=9+1*1.5
         */
        int n = cars.length;
        Deque<Integer> stack = new LinkedList<>();
        double[] res = new double[n];
        for (int i = n - 1; i >= 0; --i) {
            res[i] = -1.0;
            int currPos = cars[i][0], currSpeed = cars[i][1];
            while (stack.size() > 0) {
                int j = stack.peekLast(), afterPos = cars[j][0], afterSpeed = cars[j][1];
                // 如果当前的速度小于位置靠后【栈中的元素为位置靠后的元素】元素的速度 -> 无法碰撞 -> 弹出
                // 位置靠后元素的碰撞时间【res[j]-这个时间是位置靠后元素与更靠后元素的碰撞时间】小于当前元素和其【位置靠后元素】发生碰撞的时间 -> 则当前元素不会和其后面的元素碰撞 -> 弹出
                // [3,4]和[6,3]在3秒时碰撞，[6,3],[9,1]在1.5秒时碰撞 ->因此[3,4]和[6,3]没办法在3秒时碰撞，因为1.5秒时[6,3]已经和[9,1]碰撞了
                if (currSpeed <= afterSpeed || 1.0 * (afterPos - currPos) / (currSpeed - afterSpeed) >= res[j] && res[j] > 0)
                    stack.pollLast();
                else
                    break;
            }
            // 栈中的元素会和当前元素发生碰撞
            if (stack.size() > 0) {
                int j = stack.peekLast(), p2 = cars[j][0], s2 = cars[j][1];
                res[i] = 1.0 * (p2 - currPos) / (currSpeed - s2);
            }
            stack.add(i);
        }
        return res;
    }
}
