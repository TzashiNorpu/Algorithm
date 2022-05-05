package algo.tzashinorpu.DpPlan.GSSY.Package;

import java.util.Arrays;

public class canPartition_416 {
    // dp[i][j] i个数和<=j的最大值
    public boolean canPartition1(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) return false;
        int target = sum / 2;
        int len = nums.length;
        int[][] dp = new int[len][target + 1];
        for (int i = 0; i <= target; i++) {
            dp[0][i] = nums[0] <= i ? nums[0] : 0;
        }
        for (int i = 1; i < len; i++) {
            int num = nums[i];
            for (int j = 0; j <= target; j++) {
                int noChooseI = dp[i - 1][j];
                int chooseI = j > num ? dp[i - 1][j - num] + num : 0;
                dp[i][j] = Math.max(noChooseI, chooseI);
            }
        }
        return dp[len - 1][target] == target;
    }

    public boolean canPartition2(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) return false;
        int target = sum / 2;
        int len = nums.length;
        int[][] dp = new int[2][target + 1];
        for (int i = 0; i <= target; i++) {
            dp[0][i] = nums[0] <= i ? nums[0] : 0;
        }
        for (int i = 1; i < len; i++) {
            int num = nums[i];
            for (int j = 0; j <= target; j++) {
                int noChooseI = dp[(i - 1) & 1][j];
                int chooseI = j > num ? dp[(i - 1) & 1][j - num] + num : 0;
                dp[i & 1][j] = Math.max(noChooseI, chooseI);
            }
        }
        return dp[(len - 1) & 1][target] == target;
    }

    public boolean canPartition3(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) return false;
        int target = sum / 2;
        int len = nums.length;
        int[] dp = new int[target + 1];
        for (int i = 0; i <= target; i++) {
            dp[i] = nums[0] <= i ? nums[0] : 0;
        }
        for (int i = 1; i < len; i--) {
            int num = nums[i];
            for (int j = target; j >= num; j++) {
                int noChooseI = dp[j];
                int chooseI = dp[j - num] + num;
                dp[j] = Math.max(noChooseI, chooseI);
            }
        }
        return dp[target] == target;
    }

    //  dp[i][j] i个数和=j
    public boolean canPartition4(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) return false;
        int target = sum / 2;
        int len = nums.length;
        boolean[][] dp = new boolean[len + 1][target + 1];
        // dp[i][j] = dp[i-1][j] || dp[i-1][j-num]
        dp[0][0] = true;
        for (int i = 1; i <= len; i++) {
            int num = nums[i - 1];
            for (int j = 0; j <= target; j++) {
                boolean noChoose = dp[i - 1][j];
                boolean choose = j >= num && dp[i - 1][j - num];
                dp[i][j] = noChoose || choose;
                if (dp[i][target]) return true;
            }
        }
        return false;
    }

    public boolean canPartition5(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) return false;
        int target = sum / 2;
        int len = nums.length;
        boolean[][] dp = new boolean[2][target + 1];
        // dp[i][j] = dp[i-1][j] || dp[i-1][j-num]
        dp[0][0] = true;
        for (int i = 1; i <= len; i++) {
            int num = nums[i - 1];
            for (int j = 0; j <= target; j++) {
                boolean noChoose = dp[(i - 1) & 1][j];
                boolean choose = j >= num && dp[(i - 1) & 1][j - num];
                dp[i & 1][j] = noChoose || choose;
                if (dp[i & 1][target]) return true;
            }
        }
        return false;
    }

    public boolean canPartition6(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) return false;
        int target = sum / 2;
        int len = nums.length;
        boolean[] dp = new boolean[target + 1];
        // dp[i][j] = dp[i-1][j] || dp[i-1][j-num]
        dp[0] = true;
        for (int i = 1; i <= len; i++) {
            int num = nums[i - 1];
            for (int j = target; j >= 0; j--) {
                boolean noChoose = dp[j];
                boolean choose = j >= num && dp[j - num];
                dp[j] = noChoose || choose;
                if (dp[target]) return true;
            }
        }
        return false;
    }
}
