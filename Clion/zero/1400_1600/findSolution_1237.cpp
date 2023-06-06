//
// Created by tseringnorpu on 6/6/2023.
//
#include "../header/header.h"
using namespace zero;

vector <vector<int>> Solution::findSolution(CustomFunction &customfunction, int z) {
    vector<vector<int>> res;
    int j=1000;
    for (int i = 1; i <= 1000; ++i) {
        while (j>1&&customfunction.f(i,j)>z) j--;
        if (customfunction.f(i,j)==z)
            res.push_back({i, j});
    }
    return res;
}