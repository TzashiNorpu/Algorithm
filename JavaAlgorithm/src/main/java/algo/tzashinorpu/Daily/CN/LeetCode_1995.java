package algo.tzashinorpu.Daily.CN;

import java.util.HashMap;
import java.util.Hashtable;

public class LeetCode_1995 {
    // brute force
    public int countQuadruplets1(int[] nums) {
        int res = 0;
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            for (int j = i + 1; j < length - 2; j++) {
                for (int k = j + 1; k < length - 1; k++) {
                    for (int l = k + 1; l < length; l++) {
                        if (nums[i] + nums[j] + nums[k] == nums[l]) {
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }

    // hash o(n^3)
    public int countQuadruplets2(int[] nums) {
        int res = 0;
        int length = nums.length;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int c = length - 2; c >= 2; c--) {
            cnt.put(nums[c + 1], cnt.getOrDefault(nums[c + 1], 0) + 1);
            for (int a = 0; a < c; a++) {
                for (int b = a + 1; b < c; b++) {
                    res += cnt.getOrDefault(nums[a] + nums[b] + nums[c], 0);
                }
            }
        }
        return res;
    }

    // hash array o(n^3)
    public int countQuadruplets2_1(int[] nums) {
        int res = 0;
        int length = nums.length;
        // 1 <= nums[i] <= 100  因此  3<=nums[a] + nums[b] + nums[c] <=300
        int[] cnt = new int[301];
        for (int c = length - 2; c >= 2; c--) {
            // 每次 c 往左移动一个单位，d 的可取下标范围增加一个（即 c+1 位置)
            cnt[nums[c + 1]]++;
            for (int a = 0; a < c; a++) {
                for (int b = a + 1; b < c; b++) {
                    res += cnt[nums[a] + nums[b] + nums[c]];
                }
            }
        }
        return res;
    }

    // hash array o(n^2)
    public int countQuadruplets3(int[] nums) {
        int res = 0;
        int length = nums.length;
        int[] cnt = new int[301];
        int OFFSET = 100;
        // nums[a]+nums[b]=nums[d]-nums[c]
        // 枚举每一个b的位置
        for (int b = length - 3; b >= 1; b--) {
            for (int d = b + 2; d < length; d++) {
                // 1 <= nums[i] <= 100  因此 -99 <= nums[d] - nums[b + 1] <=99
                // 双重循环 枚举所有 d - c 的可能组合 外重循环改变 c 的位置，内重循环改变 d 的位置
                cnt[nums[d] - nums[b + 1] + OFFSET]++;
            }
            for (int a = 0; a < b; a++) {
                res += cnt[nums[a] + nums[b] + OFFSET];
            }
        }
        return res;
    }

    // hash o(n^2)
    public int countQuadruplets3_1(int[] nums) {
        int res = 0;
        int length = nums.length;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        // nums[a]+nums[b]=nums[d]-nums[c]
        // 枚举每一个b的位置
        for (int b = length - 3; b >= 1; b--) {
            for (int d = b + 2; d < length; d++) {
                // 1 <= nums[i] <= 100  因此 -99 <= nums[d] - nums[b + 1] <=99
                // 双重循环 枚举所有 d - c 的可能组合 外重循环改变 c 的位置，内重循环改变 d 的位置
                cnt.put(nums[d] - nums[b + 1], cnt.getOrDefault(nums[d] - nums[b + 1], 0) + 1);
            }
            for (int a = 0; a < b; a++) {
                res += cnt.getOrDefault(nums[a] + nums[b], 0);
            }
        }
        return res;
    }
}
