//
// Created by tseringnorpu on 6/7/2023.
//
#include "../header/header.h"
using namespace zero;

long long Solution::getDescentPeriods(vector<int> &prices) {
    int n = prices.size();
    vector<int> dp(n,1);
    long long res=1;
    for (int i = 1; i < n; ++i) {
        if (prices[i]==prices[i-1]-1) dp[i]=dp[i-1]+1;
        res +=dp[i];
    }
    return res;
}