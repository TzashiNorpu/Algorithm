//
// Created by TzashiNorpu on 7/26/2022.
//
#include "header.h"

using namespace ZeroTrac;

long long Solution::countPairs_2316(int n, vector<vector<int>> &edges) {
    vector<vector<int>> g(n);
    for (auto &e: edges) {
        int x = e[0], y = e[1];
        g[x].push_back(y);
        g[y].push_back(x);
    }
    vector<bool> vis(n, false);
    long ans = 0L;
    int cnt = 0;
    function<void(int)> dfs = [&](int x) {
        vis[x] = true;
        ++cnt;
        for (int y: g[x]) if (!vis[y]) dfs(y);
    };
    for (int i = 0, tot = 0; i < n; ++i) {
        if (!vis[i]) {
            cnt = 0;
            dfs(i);
            ans += (long) cnt * tot;
            tot += cnt;
        }
    }
    return ans;
}