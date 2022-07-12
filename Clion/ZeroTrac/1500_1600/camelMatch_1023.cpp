//
// Created by TzashiNorpu on 7/12/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<bool> camelMatch_1023::camelMatch(vector<string> &queries, string pattern) {
    vector<bool> res;
    vector<char> need;
    for (auto s: queries) {
        int q = 0;
        int p = 0;
        int j = 0;
        for (int i = 0; i < s.size(); i++) {
            if (isupper(s[i])) q++;
            if (j < pattern.size() && s[i] == pattern[j]) {
                if (isupper(pattern[j])) p++;
                j++;
            }
        }
        if (j == pattern.size() && p == q) res.push_back(true);
        else res.push_back(false);
    }
    return res;
}
