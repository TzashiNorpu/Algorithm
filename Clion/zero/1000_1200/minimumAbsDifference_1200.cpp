//
// Created by tseringnorpu on 6/3/2023.
//

#include "../header/header.h"
using namespace zero;

vector <vector<int>> Solution::minimumAbsDifference(vector<int> &arr) {
    unordered_map<int,vector<vector<int>>> m;
    if (arr.size()<2) return vector <vector<int>>{};
    sort(arr.begin(), arr.end());
    int mx = arr[1] - arr[0];
    for (int i = 0; i < arr.size() - 1; ++i) {
        int diff = arr[i + 1] - arr[i];
        mx = min(mx, diff);
        m[diff].push_back({arr[i], arr[i +1]});
    }
    return m[mx];
}