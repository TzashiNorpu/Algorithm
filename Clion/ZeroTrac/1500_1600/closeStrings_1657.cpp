//
// Created by TzashiNorpu on 7/11/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool closeStrings_1657::closeStrings(string word1, string word2) {
    // 字符相同且频次一样
    if (word1.size() != word2.size()) return false;
    vector<int> cnt1(26, 0);
    vector<int> cnt2(26, 0);
    vector<int> cnt3(26, 0);
    vector<int> cnt4(26, 0);
    for (int i = 0; i < word1.length(); i++) {
        cnt1[word1[i] - 'a']++;
        cnt3[word1[i] - 'a'] = 1;
        cnt2[word2[i] - 'a']++;
        cnt4[word2[i] - 'a'] = 1;
    }
    std::sort(cnt1.begin(), cnt1.end());
    std::sort(cnt2.begin(), cnt2.end());
    return cnt3 == cnt4 && cnt1 == cnt2;
}
