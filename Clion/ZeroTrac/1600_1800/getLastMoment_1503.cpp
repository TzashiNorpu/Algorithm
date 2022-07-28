//
// Created by TzashiNorpu on 7/28/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::getLastMoment_1503(int n, vector<int> &left, vector<int> &right) {
    /*int l = max_element(left.begin(), left.end()) - left.begin();
    int r = min_element(right.begin(), right.end()) - right.begin();
    return max(left[l], n - right[r]);*/
    int lmx = 0, rmx = 0;
    for (auto &l: left)
        lmx = max(lmx, l);

    for (auto &r: right)
        rmx = max(rmx, n - r);

    return max(lmx, rmx);
}