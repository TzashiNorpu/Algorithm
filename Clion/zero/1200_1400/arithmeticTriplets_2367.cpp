//
// Created by tseringnorpu on 6/5/2023.
//
#include "../header/header.h"
using namespace zero;

int Solution::arithmeticTriplets(vector<int> &nums, int diff) {
    vector<int> count(300, 0);
    for(auto num:nums) count[num]=1;
    int res=0;
    for (auto num: nums) {
        if (count[num]==1 && count[num+diff]==1 && count[num+diff+diff]==1) res++;
    }
    return res;
}