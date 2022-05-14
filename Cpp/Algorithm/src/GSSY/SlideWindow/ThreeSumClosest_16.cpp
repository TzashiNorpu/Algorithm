#include "../gssy.h"
#include <vector>
#include <algorithm>
using namespace GSSY;
int ThreeSumClosest_16::threeSumClosest(vector<int>& nums, int target) {
    sort(nums.begin(), nums.end());
    int ans = nums[0] + nums[1] + nums[2];
    int len = nums.size();
    for (size_t i = 0; i < len; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        int l = i + 1, r = len - 1;
        while (l < r) {
            int sum = nums[i] + nums[l] + nums[r];
            if (abs(sum - target) < abs(ans - target)) ans = sum;
            if (sum > target) r--;
            else if (sum < target) l++;
            else return ans;
        }
    }
    return ans;
}