package algo.tzashinorpu.Daily.COM;

import java.util.HashSet;

public class isHappy_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while (!set.contains(sum)) {
            while (n != 0) {
                int tmp = n % 10;
                sum += (tmp * tmp);
                n = n / 10;
            }
            if (sum == 1) return true;
            if (set.contains(sum)) return false;
            set.add(sum);
            n = sum;
            sum = 0;
        }
        return false;
    }

}
