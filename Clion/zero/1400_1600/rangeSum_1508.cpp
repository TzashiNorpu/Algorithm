//
// Created by TzashiNorpu on 2023/6/6.
//
#include "../header/header.h"

using namespace zero;

int Solution::rangeSum(vector<int> &nums, int n, int left, int right) {
    auto sum_v = vector<int>(n*(n+1)/2);
    const int MODULO = 1000000007;
    int index = 0;
    for (int i = 0; i < n; ++i) {
        int sum=0;
        for (int j = i ; j < n; ++j) {
            sum += nums[j];
            sum_v[index++]=sum;
        }
        //for(auto x : tmp) printf("x=%d\n",x);
    }
    std::sort(sum_v.begin(), sum_v.end());
    int res = 0;
    for (int i = left - 1; i <= right - 1; ++i) {
        res = (res + sum_v[i]) % MODULO;
    }
    return res;
}