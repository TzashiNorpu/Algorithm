//
// Created by TzashiNorpu on 7/28/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::countSquares_1277(vector<vector<int>> &matrix) {
    int res = 0;
    /*for (int i = 0; i < matrix.size(); i++) res += matrix[i][0];
    for (int i = 0; i < matrix[0].size(); i++) res += matrix[0][i];
    res -= matrix[0][0];*/
    for (int i = 0; i < matrix.size(); ++i) {
        for (int j = 0; j < matrix[0].size(); ++j) {
            if (i > 0 && j > 0 && matrix[i][j] != 0)
                matrix[i][j] = min({matrix[i - 1][j], matrix[i][j - 1], matrix[i - 1][j - 1]}) + 1;
            res += matrix[i][j];
        }
    }
    return res;
}