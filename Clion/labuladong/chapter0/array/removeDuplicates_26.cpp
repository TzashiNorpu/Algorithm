//
// Created by tseringnorpu on 6/1/2023.
//
#include "../../header/header.h"

using namespace labuladong;

int Solution::removeDuplicates(vector<int> &nums) {
    int pos=0;
    for (int i = 0; i < nums.size(); i++) {
        if (nums[pos]!=nums[i])
          nums[++pos]=nums[i];
    }
    return pos+1;
}