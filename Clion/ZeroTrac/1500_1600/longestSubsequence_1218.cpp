//
// Created by TzashiNorpu on 7/25/2022.
//
#include "header.h"

using namespace ZeroTrac;

int longestSubsequence_1218::longestSubsequence(vector<int> &arr, int difference) {
    unordered_map<int, int> lengths;
    int result = 1;
    for (int &i: arr)
        result = max(result, lengths[i] = 1 + lengths[i - difference]);
    return result;
}