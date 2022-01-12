package algo.tzashinorpu.Daily.CN;

public class increasingTriplet_334 {
    public boolean increasingTriplet(int[] nums) {
        // 20,100,10,12,5,13
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > second) {
                return true;
            }
            if (num < first) {
                first = num;
            }
            if (num > first) {
                second = num;
            }
        }
        return false;
    }
}
