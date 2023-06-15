//
// Created by tseringnorpu on 6/15/2023.
//
#include "../header/header.h"

using namespace zero;

int Solution::maxDiff(int num) {
    string maxS = to_string(num);;
    string minS = maxS;
    int n = minS.size();

    char c = minS[0];
    unordered_set<int> poses;
    for (int i = 0; i < n; ++i) {
        maxS[i] = '9';
        if (minS[i]==c) minS[i] = '1', poses.insert(i);
    }

    for (int i = 0; i < n; ++i) {
        if (poses.find(i)==poses.end()) minS[i] = '0';
    }
    return stoi(maxS) - stoi(minS);
}