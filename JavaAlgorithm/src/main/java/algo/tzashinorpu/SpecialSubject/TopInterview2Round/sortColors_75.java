package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class sortColors_75 {
    public void sortColors_1(int[] nums) {
        int len = nums.length;
        if (len < 2) return;
        // [0,p0) == 0
        // [p0,i) == 1
        // (p2,len-1] == 2  --> 循环不变量
        int i = 0, p0 = 0, p2 = len - 1;
        while (i <= p2) {
            if (nums[i] == 0) {
                swap(i, p0, nums);
                p0++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(i, p2, nums);
                p2--;
            }
        }
    }

    public void sortColors_2(int[] nums) {
        int len = nums.length;
        if (len < 2) return;
        // [0,p0] == 0
        // (p0,i) == 1
        // [p2,len-1] == 2  --> 循环不变量
        int i = 0, p0 = -1, p2 = len;
        while (i < p2) {
            if (nums[i] == 0) {
                p0++;
                swap(i, p0, nums);
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                p2--;
                swap(i, p2, nums);
            }
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
