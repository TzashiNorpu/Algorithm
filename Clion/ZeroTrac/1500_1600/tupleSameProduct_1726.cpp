//
// Created by TzashiNorpu on 7/11/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool valid(vector<int> &nums) {
    int a = nums[0];
    int b = nums[1];
    int c = nums[2];
    int d = nums[3];
    return (a * b == c * d) && (a != b && b != c && c != d);
}

void tupleSameProduct_1726::helper(vector<int> &nums, vector<int> &choose, vector<bool> chooseIdx) {
    if (choose.size() == 4) {
        if (valid(choose)) {
            res++;
        }
        return;
    }
    for (int i = 0; i < nums.size(); i++) {
        if (!chooseIdx[i]) {
            choose.push_back(nums[i]);
            chooseIdx[i] = true;
            helper(nums, choose, chooseIdx);
            chooseIdx[i] = false;
            choose.pop_back();
        }
    }
}

int tupleSameProduct_1726::tupleSameProduct(vector<int> &nums) {
    vector<int> choose;
    vector<bool> chooseIdx(nums.size(), false);
    helper(nums, choose, chooseIdx);
    return res;
}


