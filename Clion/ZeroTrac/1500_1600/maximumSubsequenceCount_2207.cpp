//
// Created by TzashiNorpu on 7/14/2022.
//
#include "header.h"

using namespace ZeroTrac;

/*
 * If we add pattern[0], the best option is to add at the begin.
 * If we add pattern[1], the best option is to add at the end.
 */
long long maximumSubsequenceCount_2207::maximumSubsequenceCount(string text, string pattern) {
    long long res = 0, cnt1 = 0, cnt2 = 0;
    for (int i = 0; i < text.length(); ++i) {
        if (text[i] == pattern[1]) {
            res += cnt1;
            cnt2++;
        }
        if (text[i] == pattern[0]) cnt1++;
    }
    return res + max(cnt2, cnt1);
}
