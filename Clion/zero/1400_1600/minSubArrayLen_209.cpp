//
// Created by tseringnorpu on 6/14/2023.
//
#include "../header/header.h"
using namespace zero;

int Solution::minSubArrayLen(int target, vector<int> &nums) {
    int n = nums.size(),i=0,j=0;
    int res=n+1;
    for (; j < n; j++) {
        target -= nums[j];
        while (target <= 0) {
            res = min(res, j - i + 1);
            target += nums[i++];
        }
    }
    return res%(n+1);
}