//
// Created by TzashiNorpu on 7/12/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<vector<int>> findFarmland_1992::findFarmland(vector<vector<int>> &land) {
    vector<vector<int>> res;
    int row = land.size();
    int col = land[0].size();
    for (int i = 0; i < row;) {
        for (int j = 0; j < col;) {
            if (!land[i][j]) continue;
            // rightest
            int c = j;
            while (c < col && land[i][c]) c++;
            // bottom
            int r = i;
            while (r < row && land[r][j]) r++;
            res.push_back({i, j, r - 1, c - 1});
            for (int k = i; k < r; k++) {
                for (int l = j; l < c; ++l) {
                    land[k][l] = 0;
                }
            }
        }
    }
    return res;
}
