//
// Created by tseringnorpu on 6/7/2023.
//
#include "../header/header.h"
using namespace zero;

int Solution::sumOddLengthSubarrays(vector<int> &arr) {
    int res=0;
    int n =arr.size();
    for (int i = 0; i <n ; ++i) {
        res += ((i + 1) * (n - i) + 1) / 2 * arr[i];
    }
    return res;
}