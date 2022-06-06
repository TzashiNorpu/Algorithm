package algo.tzashinorpu;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        int[] nums = {7, 2, 5, 10, 8};
        int sum = 10, subCount = 0, cur = 0;
        for (int num : nums) {
            if (cur + num > sum) {
                subCount += 1;
                cur = num;
            } else
                cur += num;
        }
        if (cur != 0) subCount++;
        System.out.println(subCount);


        int subCount1 = 1, cur1 = 0;
        for (int num : nums) {
            if (cur1 + num > sum) {
                subCount1 += 1;
                cur1 = 0;
            }
            cur1 += num;
        }
        System.out.println(subCount1);
    }
}
