//
// Created by TzashiNorpu on 7/26/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::findBestValue_1300(vector<int> &arr, int target) {
    int l, r, mx = -1, sum = 0;
    for (int num: arr) sum += num, mx = max(mx, num);
    if (sum <= target) return mx;
    l = target / arr.size(), r = mx;
    while (l <= r) {
        int mid = l + (r - l) / 2;
        sum = 0;
        for (int v: arr) sum += (v > mid ? mid : v);
        if (sum >= target) r = mid - 1;
        else l = mid + 1;
    }
    int s1 = 0, s2 = 0;
    for (int v: arr) s1 += (v > l ? l : v), s2 += (v > (l - 1) ? (l - 1) : v);
    return abs(s1 - target) >= abs(s2 - target) ? (l - 1) : (l);
}