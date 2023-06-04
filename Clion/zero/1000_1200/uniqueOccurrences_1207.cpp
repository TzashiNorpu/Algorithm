//
// Created by tseringnorpu on 6/4/2023.
//
#include "../header/header.h"

using namespace zero;

bool Solution::uniqueOccurrences(vector<int> &arr) {
    unordered_set<int> count_st;
    unordered_map<int,int> count_map;
    for (auto num: arr) {
        count_map[num]++;
    }
    for (auto kv: count_map) {
        count_st.insert(kv.second);
    }
    return count_map.size() == count_st.size();
}