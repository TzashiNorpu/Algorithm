//
// Created by TzashiNorpu on 7/13/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<string> removeSubfolders_1233::removeSubfolders(vector<string> &folder) {
    unordered_set<string> set;
    sort(folder.begin(), folder.end());
    for (string s: folder) {
        bool exist = false;
        int pos = 1;
        for (int i = s.find_first_of('/', pos); i < s.length();) {
            string tmp = s.substr(0, i);
            if (set.count(tmp) > 0) {
                exist = true;
                break;
            }
            pos = i + 1;
            i = s.find_first_of('/', pos);
        }
        if (!exist)
            set.insert(s);
    }
    vector<string> res;
    for (auto v: set) {
        res.push_back(v);
    }
    return res;
}