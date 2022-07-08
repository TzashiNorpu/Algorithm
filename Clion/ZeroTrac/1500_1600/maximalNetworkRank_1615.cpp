//
// Created by TzashiNorpu on 7/8/2022.
//
#include "header.h"

using namespace ZeroTrac;

int MaximalNetworkRank::maximalNetworkRank(int n, vector<vector<int>> &roads) {
    /*int count[n];
    for (int i = 0; i < n; i++)
        count[i] = 0;
    bool connected[n][n];
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            connected[i][j] = false;
    array<int, n> count;
    for (vector<int> r: roads) {
        count[r[0]]++;
        count[r[1]]++;
        connected[r[0]][r[1]] = true;
        connected[r[1]][r[0]] = true;
    }*/
    vector<int> count(n, 0);
    vector<vector<bool>> connected(n, vector<bool>(n, false));
    for (vector<int> r: roads) {
        count[r[0]]++;
        count[r[1]]++;
        connected[r[0]][r[1]] = true;
        connected[r[1]][r[0]] = true;
    }
    int res = 0;
    for (int i = 0; i < n - 1; i++)
        for (int j = i + 1; j < n; j++)
            res = max(res, count[i] + count[j] - (connected[i][j] ? 1 : 0));
    return res;
}
