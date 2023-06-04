//
// Created by tseringnorpu on 6/4/2023.
//
#include "../header/header.h"

using namespace zero;

int Solution::maximumCount(vector<int> &nums) {
    int neg_count=0,pos_count=0;
    for (auto num: nums) {
        if(num>0) pos_count++;
        if(num<0) neg_count++;
    }
    return max(neg_count,pos_count);
}