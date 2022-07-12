//
// Created by TzashiNorpu on 7/12/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<long long> maximumEvenSplit_2178::maximumEvenSplit(long long finalSum) {
    if (finalSum & 1) return {};
    vector<long long> res;
    long long sum = 0;
    for (long long i = 2; i <= finalSum; i += 2) {
        if (sum + i <= finalSum) {
            sum += i;
            res.push_back(i);
        }
        if (sum == finalSum) return res;
        if (sum + i > finalSum) break;
    }
    sum -= res.back();
    res.pop_back();
    res.push_back(finalSum - sum);
    return res;
}
