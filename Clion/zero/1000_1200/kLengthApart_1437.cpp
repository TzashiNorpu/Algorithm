//
// Created by tseringnorpu on 6/4/2023.
//
#include "../header/header.h"

using namespace zero;

bool Solution::kLengthApart(vector<int> &nums, int k) {
    int temp=0;
    for (auto num: nums) {
        if(num==1){
            if (temp>0) return false;
            else temp = k;
        } else temp--;
    }
    return true;
}