package algo.tzashinorpu.FirstRound.Chapter03.HomeWork;

public class LeetCode_2_189 {
    // https://leetcode-cn.com/problems/rotate-array/
    // 将数组中的元素向右移动 k 个位置
    // [1,2,3,4,5,6,7]  k = 3   ==> [5,6,7,1,2,3,4]
    // https://leetcode-cn.com/problems/rotate-array/solution/xuan-zhuan-shu-zu-by-leetcode/

    // 反转所有数字  then  反转前 k 个数字后  then 反转后 n-k 个数字后
    private void rotate1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // 暴力法 :  旋转 k 次，每次将数组旋转 1 个元素
    private void rotate2(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    // 使用额外的数组 : 原本数组里下标为 ii 的我们把它放到 (i+k)\%数组长度(i+k)%数组长度 的位置。然后把新的数组拷贝到原数组中
    private void rotate3(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        // for (int i = 0; i < nums.length; i++) {
        //    nums[i] = a[i];
        // }
        System.arraycopy(a, 0, nums, 0, nums.length);
    }

    // 环状替换: n 个元素并且 k 是要求移动的次数
    // 下标移动 i --> (i+k)/len
    // 第一次移动下标 i%k == 0 的元素,移动k步 仍到达 i%k ==0 的位置 移动了 n%k 个元素
    // 第二次移动下标 i%k == 1 的元素,移动k步 仍到达 i%k ==1 的位置 移动了 n%k 个元素
    // 依次移动到 i%k = k-1 的元素  移动了 n%k 个元素
    // 移动的元素总数为 n 个
    // n = 10 , k = 2

    private void rotate4(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            // count 对移动过的元素计数
            System.out.printf("count=%d\n", count);
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                System.out.printf("start=%d;curr_index=%d,curr_value=%d,store_value=%d\n", start, next, prev, temp);
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
                for (int anInt : nums) {
                    System.out.println(anInt);
                }
                System.out.printf("current=%d,count=%d\n", current, count);
                // start == current ==> n%k 为整数时用该条件更新start的值进行下一个group元素的移动
            } while (start != current);
        }
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        LeetCode_2_189 test = new LeetCode_2_189();
        test.rotate1(ints, 2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        test.rotate2(ints, 2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        test.rotate3(ints, 2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        test.rotate4(ints, 2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}
