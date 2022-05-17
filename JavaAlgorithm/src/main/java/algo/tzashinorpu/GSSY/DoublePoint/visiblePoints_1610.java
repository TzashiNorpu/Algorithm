package algo.tzashinorpu.GSSY.DoublePoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class visiblePoints_1610 {
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        int same = 0;
        List<Double> list = new ArrayList<>();
        int x = location.get(0), y = location.get(1);
        for (List<Integer> p : points) {
            int a = p.get(0), b = p.get(1);
            if (a == x && b == y) {
                same++;
            } else {
                list.add(Math.atan2(b - y, a - x));
            }
        }
        Collections.sort(list);

        int size = list.size();
        /*关于为什么要加360°的解释
        比如有两个点，一个点是179°，另一个点是-179°，angle大小是5°，如果选择以179°为起点，加上angle就是184°，范围就是179°到184°，覆盖不到-179°，可我们知道实际上-179°应该也在这个范围里的，所以我们可以让-179°加上360°，变成181°，这时候就在179°到184°的范围里了，就可以被覆盖到了
        又因为angle是小于360°的，这就保证了原来的点和它加上360°后的点不可能被同时覆盖到，也就保证了同一个点不会被重复计算两次，保证了结果的正确性*/
        for (int i = 0; i < size; i++) {
            list.add(list.get(i) + 2 * Math.PI);
        }
        double degree = angle * Math.PI / 180;
        int max = 0;
        int i = 0, j = 0;
        while (i < size) {
            while (j < 2 * size && list.get(j) - list.get(i) <= degree) j++;
            max = Math.max(max, j - i);
            i++;
        }
        return same + max;
    }
}
