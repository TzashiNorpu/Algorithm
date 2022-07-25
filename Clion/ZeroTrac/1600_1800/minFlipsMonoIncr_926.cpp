//
// Created by TzashiNorpu on 7/25/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::minFlipsMonoIncr_926(string s) {
    int res = 0, one_count = 0;
    for (char c: s) {
        if (c == '1') one_count++;
        else res = min(one_count, res + 1);
    }
    return res;
}
