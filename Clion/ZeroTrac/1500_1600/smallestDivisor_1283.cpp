//
// Created by TzashiNorpu on 7/13/2022.
//
#include "header.h"

using namespace ZeroTrac;

int smallestDivisor_1283::smallestDivisor(vector<int> &nums, int threshold) {
    int l = 1, r = 10e6, m, sum;
    while (l <= r) {
        m = l + (r - l) / 2, sum = 0;
        for (int a: nums)
            sum += (a + m - 1) / m;
        if (sum > threshold) l = m + 1;
        else r = m - 1;
    }
    return l;
}