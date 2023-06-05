//
// Created by TzashiNorpu on 2023/6/5.
//
#include "../header/header.h"

using namespace zero;

int Solution::findJudge(int n, vector <vector<int>> &trust) {
    vector<int> count(n+1, 0);
    for (auto &t:trust) {
        count[t[1]]++;
        count[t[0]]--;
    }
    for (int i = 1; i <=n; ++i) {
        if (count[i]==n-1) return i;
    }
    return -1;
}