package algo.tzashinorpu.FirstRound.Chapter03.HomeWork;

public class LeetCode_2_026_1 {
    /*public int removeDuplicates(int[] nums) {
        int pos =0;
        int loop = 1;
        while (loop< nums.length) {
            while (nums[pos] == nums[loop]) {
                loop++;
                if (loop == nums.length) {
                    return pos+1;
                }
            }
            pos++;
            nums[pos] = nums[loop];
            loop++;
        }
        return pos+1;
    }*/

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
        }
        return ++i;
    }

    public static void main(String[] args) {
        LeetCode_2_026_1 solution = new LeetCode_2_026_1();
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1};
        int i = solution.removeDuplicates(nums);
        for (int a :
                nums) {
            System.out.println(a);
        }
        System.out.println(i);
    }
}
