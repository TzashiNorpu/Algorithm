package FirstRound.leetcode.editor.cn;//给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
//
// 注意：答案中不可以包含重复的三元组。 
//
// 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
// [-4 ,-1, -1, 0, 1, 2]
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class ThreeSum {
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 排序是为了不重复
        Arrays.sort(nums);
//        for (int i : nums) {
//            System.out.println(i);
//        }
        for (int pos = 0; pos < nums.length - 2; pos++) {
            if (nums[pos] > 0) {
                break;
            }
            // -1 -1 x x x
            // pos只处理一次 = -1 的情况 -- 否则重复
            if (pos >= 1 && nums[pos] == nums[pos - 1]) {
                continue;
            }
            // -4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0
            // -5,-5,-4,-4,-4,-2,-2,-2,0,0,0,1,1,3,4,4
            // 放在for循环外面的话 1 1 只能拿到一个 1 --> 得不到 -2 1 1 的结果
            // 因此应在结果保存后将 对 l 和 r 进行更新
            // while (l < r && nums[l] == nums[l + 1]) {
            //     l++;
            // }
            // while (l < r && nums[r] == nums[r - 1]) {
            //    r--;
            // }
            for (int l = pos + 1, r = nums.length - 1; l < r; ) {

                if (nums[l] + nums[r] == -nums[pos]) {
                    List<Integer> subRes = new ArrayList<>();
                    subRes.add(nums[pos]);
                    subRes.add(nums[l]);
                    subRes.add(nums[r]);
                    res.add(subRes);
                    // -2,0,0,2,2
                    // pos 不变且三数和为0时才是去重的时点 l 和 r 进行去重
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else {
                    int t = nums[l] + nums[r] < -nums[pos] ? l++ : r--;
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int pos = 0; pos < nums.length - 2; pos++) {
            if (pos >= 1 && nums[pos] == nums[pos - 1]) {
                continue;
            }
            int[] m1 = Arrays.copyOfRange(nums, pos+1, nums.length);
            TwoSum twoSum = new TwoSum();
            int[] m2 = twoSum.twoSum(m1, -nums[pos]);
            // twoSum 需要重写
            List<Integer> subRes = new ArrayList<>();
            subRes.add(nums[pos]);
            subRes.add(m1[m2[0]]);
            subRes.add(m1[m2[1]]);
            res.add(subRes);
        }
        return res;
    }

    public static void main(String[] args) {
        ThreeSum test = new ThreeSum();
        int[] ints = new int[]{-2, 0, 0, 2, 2};
        List<List<Integer>> res = test.threeSum2(ints);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.println(res.get(i).get(j));
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
