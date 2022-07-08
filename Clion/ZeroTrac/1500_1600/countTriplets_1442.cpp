//
// Created by TzashiNorpu on 7/8/2022.
//
#include "header.h"

using namespace ZeroTrac;

int CountTriplets::countTriplets(vector<int> &arr) {
    int n = arr.size();
    int res = 0;
    for (int i = 0; i <= n - 2; i++) {
        for (int j = i + 1; j <= n - 1; j++) {
            // [i,j] 可以分成两个子数组的情况
            if (xorSum(i, j, arr)) res += j - i;
        }
    }
    return res;
}

bool CountTriplets::xorSum(int l, int r, vector<int> &nums) {
    int x = 0;
    for (int i = l; i <= r; i++) x ^= nums[i];
    return x == 0;
}
