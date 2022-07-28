//
// Created by TzashiNorpu on 7/28/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::numberOfArrays_2145(vector<int> &differences, int lower, int upper) {
    /*vector<long> preSum(differences.size(), 0);
    preSum[0] = differences[0];
    int mi = min(differences[0], 0), mx = max(differences[0], 0);
    for (int i = 1; i < differences.size(); i++)
        preSum[i] += differences[i - 1], mi = min((long) mi, preSum[i]), mx = max((long) mx, preSum[i]);
    if ((upper - mx) - (lower - mi) < -1) return 0;
    return (upper - mx) - (lower - mi) + 1;*/
    long a = 0, ma = 0, mi = 0;
    for (int d: differences) {
        a += d;
        ma = max(ma, a);
        mi = min(mi, a);
    }
    return max(0L, (upper - lower) - (ma - mi) + 1);
}