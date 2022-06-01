package algo.tzashinorpu.SpecialSubject.DataStruct;

import java.util.ArrayList;
import java.util.HashMap;

public class RandomizedSet_380 {
    ArrayList<Integer> nums;
    HashMap<Integer, Integer> locs;
    java.util.Random rand = new java.util.Random();

    public RandomizedSet_380() {
        nums = new ArrayList<Integer>();
        locs = new HashMap<Integer, Integer>();
    }

    public boolean insert(int val) {
        boolean contain = locs.containsKey(val);
        if (contain) return false;
        locs.put(val, nums.size());
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        boolean contain = locs.containsKey(val);
        if (!contain) return false;
        int loc = locs.get(val);
        if (loc < nums.size() - 1) {
            // not the last one than swap the last one with this val
            int lastVal = nums.get(nums.size() - 1);
            // list 中 loc 位置元素[需要被删除的元素]的值替换为最后元素的值
            nums.set(loc, lastVal);
            // 更新映射表中最后元素的索引
            locs.put(lastVal, loc);
        }
        locs.remove(val);
        nums.remove(nums.size() - 1);
        return true;
    }

    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}
