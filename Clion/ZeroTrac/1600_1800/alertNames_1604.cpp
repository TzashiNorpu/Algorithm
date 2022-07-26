//
// Created by TzashiNorpu on 7/26/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<string> Solution::alertNames_1604(vector<string> &keyName, vector<string> &keyTime) {
    vector<string> res;
    unordered_map<string, vector<int>> log;
    for (int i = 0; i < keyName.size(); ++i)
        log[keyName[i]].push_back(stoi(keyTime[i].substr(0, 2)) * 60 + stoi(keyTime[i].substr(3)));
    for (auto &p: log) {
        std::sort(p.second.begin(), p.second.end());
        for (int i = 0, j = 0; i < p.second.size(); i++) {
            while (p.second[i] - p.second[j] > 60)
                j++;
            if (i - j >= 2) {
                res.push_back(p.first);
                break;
            }
        }
    }
    std::sort(res.begin(), res.end());
    return res;
}