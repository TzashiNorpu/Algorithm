//
// Created by tseringnorpu on 6/1/2023.
//
#include "../../header/header.h"

using namespace labuladong;

vector<int> Solution::twoSum(vector<int> &numbers, int target) {
    int l = 0, r = numbers.size() - 1;
    while (l < r) {
        int sum = numbers[l] + numbers[r];
        if (sum==target) break;
        if (sum > target) {
            r = r-1;
        } else l = l+1;
    }
    return {l+1, r+1};
}