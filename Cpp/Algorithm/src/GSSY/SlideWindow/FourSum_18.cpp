#include "../gssy.h"
#include <algorithm>
using namespace GSSY;
vector<vector<int>> FourSum_18::fourSum(vector<int>& nums, int target) {
    vector<vector<int>> res;
    sort(nums.begin(), nums.end());
    int len = nums.size();
    for (int i = 0; i < len - 3; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        for (int j = i + 1; j < len - 2; j++) {
            if (j > i + 1 && nums[j] == nums[j - 1]) continue;
            int m = j + 1, n = len - 1;
            while (m < n) {
                while (m > j + 1 && m < len - 1 && nums[m] == nums[m - 1]) m++;
                if (m >= n) break;
                long long sum = (long long)nums[i] + (long long)nums[j] + (long long)nums[m] + (long long)nums[n];
                if (sum == (long long)target) {
                    res.push_back({ nums[i],nums[j],nums[m],nums[n] });
                    m++;
                }
                else if (sum > (long long)target) {
                    n--;
                }
                else { m++; }
            }
        }
    }
    return res;
}