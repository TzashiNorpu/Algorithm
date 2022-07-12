//
// Created by TzashiNorpu on 7/12/2022.
//
#include "header.h"

using namespace ZeroTrac;

int minDominoRotations_1007::minDominoRotations(vector<int> &tops, vector<int> &bottoms) {
    /*
     * [2,3,2,1,1,1,2,2]
     * [2,1,2,1,1,3,1,1]
     */
    vector<vector<int>> top_vec(7, vector<int>(2, 0));
    vector<vector<int>> bot_vec(7, vector<int>(2, 0));
    int n = tops.size();
    int res = n + 1;
    for (int i = 0; i < n; i++) {
        int t = tops[i];
        int b = bottoms[i];
        top_vec[t][0]++;
        bot_vec[b][0]++;
        if (t == b) {
            top_vec[t][1]++;
            bot_vec[b][1]++;
        }
        if (n - top_vec[t][0] <= (bot_vec[t][0] - bot_vec[t][1]))
            res = min(res, min(n - top_vec[t][0],
                               n - bot_vec[t][0]));
        if (n - top_vec[b][0] <= (bot_vec[b][0] - bot_vec[b][1]))
            res = min(res, min(n - top_vec[b][0],
                               n - bot_vec[b][0]));
    }
    if (res == n + 1) return -1;
    return res;
}
