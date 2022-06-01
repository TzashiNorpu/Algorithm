package algo.tzashinorpu.SpecialSubject.DataStruct;

import java.util.HashMap;
import java.util.Random;

public class RandomPickwithBlacklist_710 {
    // N = 5, blacklist = [1,3]，那么多次调⽤ pick 函数，会等概率随机返回 0, 2, 4 中的某⼀个数字。
    private int sz;
    private Random r;
    // v <-> index
    private HashMap<Integer, Integer> map;

    public RandomPickwithBlacklist_710(int N, int[] blacklist) {
        map = new HashMap<>();
        // 最后⼀个元素的索引
        int last = N - 1;
        // 将⿊名单中的索引换到最后去
        for (int b : blacklist) // O(B)
            map.put(b, -1);
        // 最终数组中的元素个数
        sz = N - blacklist.length;

        for (int b : blacklist) { // O(B)\
            // 如果 b 已经在区间 [sz, N)
            // 可以直接忽略
            if (b >= sz) {
                continue;
            }
            while (map.containsKey(last)) {
                last--;
            }
            map.put(b, last);
            last--;
        }
        r = new Random();
    }

    public int pick() {
        // 随机选取⼀个索引
        int p = r.nextInt(sz);
        // 这个索引命中了⿊名单，需要被映射到其他位置【转换到[sz,N)】
        if (map.containsKey(p))
            return map.get(p);
        // 若没命中⿊名单，则直接返回
        return p;
    }
}
