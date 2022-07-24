package algo.tzashinorpu.WeekContest.D220723;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class NumberContainers_6130 {
    Map<Integer, PriorityQueue<Integer>> m1;
    Map<Integer, Integer> m2;

    public NumberContainers_6130() {
        this.m1 = new HashMap<>();
        this.m2 = new HashMap<>();
    }

    public void change(int index, int number) {
        if (this.m2.containsKey(index)) {
            this.m1.get(this.m2.get(index)).remove(index);
        }
        this.m1.putIfAbsent(number, new PriorityQueue<>());
        this.m1.get(number).offer(index);
        this.m2.put(index, number);
    }

    public int find(int number) {
        while (this.m1.containsKey(number) && this.m1.get(number).size() > 0 &&
                number != this.m2.get(this.m1.get(number).peek())) {
            this.m1.get(number).remove();
        }
        if (this.m1.containsKey(number) && this.m1.get(number).size() > 0) return this.m1.get(number).peek();
        return -1;
    }
}
