//
// Created by TzashiNorpu on 7/14/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<vector<int>> diagonalSort_1329::diagonalSort(vector<vector<int>> &mat) {
    unordered_map<int, priority_queue<int, vector<int>, greater<int>>> map;
    int m = mat.size(), n = mat[0].size();
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; ++j) {
            map[i - j].push(mat[i][j]);
        }
    }
    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            mat[i][j] = map[i - j].top();
            map[i - j].pop();
        }
    }
    return mat;
}