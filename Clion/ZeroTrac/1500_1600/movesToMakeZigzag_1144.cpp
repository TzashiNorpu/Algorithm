//
// Created by TzashiNorpu on 7/15/2022.
//
#include "header.h"

using namespace ZeroTrac;

int movesToMakeZigzag_1144::movesToMakeZigzag(vector<int> &nums) {
    int res[2] = {0, 0}, n = nums.size(), left, right;
    for (int i = 0; i < n; ++i) {
        left = i > 0 ? nums[i - 1] : 1001;
        right = i + 1 < n ? nums[i + 1] : 1001;
        res[i % 2] += max(0, nums[i] - min(left, right) + 1);
    }
    return min(res[0], res[1]);
}
