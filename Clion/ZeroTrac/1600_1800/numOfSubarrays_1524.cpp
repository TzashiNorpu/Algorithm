//
// Created by TzashiNorpu on 7/27/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::numOfSubarrays_1524(vector<int> &arr) {
    int mod = 1e9 + 7;
    int n = arr.size();
//    for (auto &a: arr) a = a % 2;
    vector<int> dp_even(n), dp_odd(n);
    if (arr[n - 1] % 2 == 0) dp_even[n - 1] = 1;
    else dp_odd[n - 1] = 1;
    for (int i = n - 2; i >= 0; --i) {
        if (arr[i] % 2 == 1) {
            dp_odd[i] = (1 + dp_even[i + 1]) % mod;
            dp_even[i] = dp_odd[i + 1];
        } else {
            dp_odd[i] = dp_odd[i + 1];
            dp_even[i] = (1 + dp_even[i + 1]) % mod;
        }
    }
    int sum = 0;
    for (auto ele: dp_odd) sum += ele, sum %= mod;
    return sum;
}