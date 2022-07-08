//
// Created by TzashiNorpu on 7/8/2022.
//
#include "header.h"

using namespace ZeroTrac;


int DigArtifacts::digArtifacts(int n, vector<vector<int>> &artifacts, vector<vector<int>> &dig) {
    set<string> set;
    for (auto d: dig) set.insert(to_string(d[0]) + " " + to_string(d[1]));
    int c = 0;
    // artifacts[i] 这个区域下面埋了宝藏
    for (auto a: artifacts) {
        bool done = true;
        for (int i = a[0]; i <= a[2]; i++) {
            for (int j = a[1]; j <= a[3]; j++) {
                if (set.count(to_string(i) + " " + to_string(j)) == 0) done = false;
            }
        }
        if (done) c++;
    }
    return c;
}