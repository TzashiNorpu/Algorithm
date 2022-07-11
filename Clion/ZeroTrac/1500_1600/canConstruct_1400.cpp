//
// Created by TzashiNorpu on 7/11/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool canConstruct_1400::canConstruct(string s, int k) {
    vector<int> cnt(26, 0);
    if (s.size() < k) return false;
    for (int i = 0; i < s.size(); i++) {
        cnt[s[i] - 'a']++;
    }
    int res = 0;
    for (int i = 0; i < 26; i++) {
        if (cnt[i] % 2) res++;
    }
    return res <= k;
}
