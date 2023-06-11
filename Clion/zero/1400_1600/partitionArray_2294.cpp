//
// Created by tseringnorpu on 6/11/2023.
//
#include "../header/header.h"
using namespace zero;

int Solution::partitionArray(vector<int> &nums, int k) {
    std::sort(nums.begin(), nums.end());
    int count=0;
    int n = nums.size();
    for (int l = 0,r=0; l < n; ) {
        while (r<n &&nums[r]-nums[l]<=k) r++;
        l=r;
        count++;
    }
    return count;
}