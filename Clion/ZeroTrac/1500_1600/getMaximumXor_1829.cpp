//
// Created by TzashiNorpu on 7/8/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<int> GetMaximumXor::getMaximumXor(vector<int> &nums, int maximumBit) {
    int n = nums.size();
    vector<int> res(n);
    int range = pow(2, maximumBit);
    int x = 0;
    for (auto num: nums) {
        x ^= num;
    }
    int bak = x;
    for (int i = 0; i < n; i++) {
        bak = i > 0 ? (bak ^ nums[n - i]) : bak;
        int val = 0;
        int max = bak;
        for (int k = 0; k < range; k++) {
            int tmp = bak ^ k;
            if (tmp > max) {
                max = tmp;
                val = k;
            }
        }
        res[i] = val;
    }
    return res;
}
