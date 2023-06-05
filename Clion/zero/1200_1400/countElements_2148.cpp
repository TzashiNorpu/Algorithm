//
// Created by tseringnorpu on 6/5/2023.
//
#include "../header/header.h"
using namespace zero;

int Solution::countElements(vector<int> &nums) {
    std::sort(nums.begin(), nums.end());
    int len = nums.size();
    if (len<=2) return 0;
    int l = 0, r = len - 1;
    while (l<len&&nums[l]<=nums[0])  l++;
    while (r>=0&&nums[r]>=nums[len-1])  r--;
    return r>l?r-l+1:(r==l?1:0);
}