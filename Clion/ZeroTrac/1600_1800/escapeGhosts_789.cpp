//
// Created by TzashiNorpu on 7/27/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool Solution::escapeGhosts_789(vector<vector<int>> &ghosts, vector<int> &target) {
    for (auto &g: ghosts)
        if ((abs(g[0] - target[0]) + abs(g[1] - target[1])) <= (abs(target[0]) + abs(target[1])))
            return false;
    return true;
}