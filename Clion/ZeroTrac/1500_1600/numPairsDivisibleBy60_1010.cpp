//
// Created by TzashiNorpu on 7/11/2022.
//
#include "header.h"

using namespace ZeroTrac;

int numPairsDivisibleBy60_1010::numPairsDivisibleBy60(vector<int> &time) {
    unordered_map<int, int> map;
    int res = 0;
    for (auto t: time) {
        if (map.count((60 - t % 60) % 60) != 0) {
            res += map[(60 - t % 60) % 60];
        }
        map[t % 60]++;
    }
    return res;
}