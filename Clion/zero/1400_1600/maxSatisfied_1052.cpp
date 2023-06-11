//
// Created by tseringnorpu on 6/11/2023.
//
#include "../header/header.h"

using namespace zero;

int Solution::maxSatisfied(vector<int> &customers, vector<int> &grumpy, int minutes) {
    // slide
    int res=0;
    int slideSum=0;
    int n = customers.size();
    for (int i = 0; i < n; ++i) {
        if (i<minutes) slideSum += customers[i];
        else {
            if (grumpy[i]==0) slideSum += customers[i];
        }
    }
    //printf("slideSum=%d\n", slideSum);
    res = slideSum;
    int l=0,r = minutes-1;
    while (r < n-1) {
        if (grumpy[r+1]==1) slideSum += customers[r+1];
        if (grumpy[l]==1) slideSum -= customers[l];
        res = max(res, slideSum);
        //printf("slideSum=%d,res=%d\n", slideSum,res);
        l++,r++;
    }
    return res;
}