package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

import java.util.HashMap;
import java.util.Map;

public class subarraysDivByK_974 {
    /*
    Input: nums = [4,5,0,-2,-3,1], k = 5
    Output: 7
    Explanation: There are 7 subarrays with a sum divisible by k = 5:
    [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
     */
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);// 余数累加为0时的初始化
        int prefix = 0, res = 0;
        for (int a : A) {
            // 之前的余数加上当前的数的余数和之前一样，则说明当前这个数符合整除要求
            // a % K :控制负数的值
            // + K：将负数影响转化为正数
            prefix = (prefix + a % K + K) % K;
            res += count.getOrDefault(prefix, 0);
            count.put(prefix, count.getOrDefault(prefix, 0) + 1);
        }
        return res;
        /*int[] count = new int[K];
        count[0] = 1;
        int prefix = 0, res = 0;
        for (int a : A) {
            prefix = (prefix + a % K + K) % K;
            res += count[prefix]++;
        }
        return res;*/
    }
}
