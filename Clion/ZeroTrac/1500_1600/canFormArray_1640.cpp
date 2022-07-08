//
// Created by TzashiNorpu on 7/8/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool CanFormArray::canFormArray(vector<int> &arr, vector<vector<int>> &pieces) {
    unordered_map<int, int> map;
    for (int i = 0; i < arr.size(); i++) {
        map.insert(unordered_map<int, int>::value_type(arr[i], i));
    }
    for (auto p: pieces) {
        if (p.size() == 1) {
            if (map.count(p[0]) == 0) return false;
        } else {
            for (int i = 0; i < p.size() - 1; i++) {
                if (map.count(p[i]) == 0 || map.count(p[i + 1]) == 0) return false;
                if (map.at(p[i]) != (map.at(p[i + 1]) - 1)) return false;
            }
        }
    }
    return true;
}
