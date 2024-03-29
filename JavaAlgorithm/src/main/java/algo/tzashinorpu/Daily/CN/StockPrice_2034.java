package algo.tzashinorpu.Daily.CN;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StockPrice_2034 {
    private Map<Integer, Integer> map = new HashMap<>();
    // 值 和 次数
    private TreeMap<Integer, Integer> ts = new TreeMap<>();
    private int cur;

    public StockPrice_2034() {
    }

    public void update(int timestamp, int price) {
        cur = Math.max(cur, timestamp);
        if (map.containsKey(timestamp)) {
            int old = map.get(timestamp);
            int cnt = ts.get(old);
            if (cnt == 1) ts.remove(old);
            else ts.put(old, cnt - 1);
        }
        map.put(timestamp, price);
        ts.put(price, ts.getOrDefault(price, 0) + 1);
    }

    public int current() {
        return map.get(cur);
    }

    public int maximum() {
        return ts.lastKey();
    }

    public int minimum() {
        return ts.firstKey();
    }
}
