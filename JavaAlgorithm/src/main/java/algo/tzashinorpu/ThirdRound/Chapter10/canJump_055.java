package algo.tzashinorpu.ThirdRound.Chapter10;

public class canJump_055 {
    public boolean canJump1(int[] nums) {
        // 3,2,1,0,4 -> false
        // 2,3,1,1,4 -> true
        int length = nums.length;
        int dest = length - 1; // 目标位置为最末位索引
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] + i >= dest) {
                // 上一个位置可以到达目标位置则更新目标位置
                dest = i;
            }
        }
        return dest == 0;
    }

    public boolean canJump2(int[] nums) {
        // 1,1,1,1,1 -> true
        // 0,3,1,1,4 -> false
        int length = nums.length;
        // 之前所能到达的最远索引位置
        int furthest = 0;
        for (int i = 0; i < length; i++) {
            // i > furthest 为当前位置大于之前能到的最远位置 -> 即不能从上一个位置跳过来 -> 非法
            if (i <= furthest) {
                furthest = Math.max(furthest, i + nums[i]);
                if (furthest >= length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
