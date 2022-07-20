//
// Created by TzashiNorpu on 7/18/2022.
//
#include "header.h"

using namespace ZeroTrac;

// a 是否是 b 的 subset
bool subset(vector<string> a, vector<string> b) {
    if (a.size() > b.size()) return false;
    unordered_set<string> set;
    for (string s: a) {
        set.insert(s);
    }
    for (string s: b) {
        set.erase(s);
    }
    return set.size() == 0;
}

vector<int> peopleIndexes_1452::peopleIndexes(vector<vector<string>> &favoriteCompanies) {
    vector<int> res;
    for (int i = 0; i < favoriteCompanies.size(); ++i) {
        bool e = false;
        for (int j = 0; j < favoriteCompanies.size(); ++j) {
            if (i != j && subset(favoriteCompanies[i], favoriteCompanies[j])) {
                e = true;
                break;
            }
        }
        if (!e)res.push_back(i);
    }
    return res;
}
