//
// Created by TzashiNorpu on 7/18/2022.
//
#include "header.h"

using namespace ZeroTrac;

int scoreOfParentheses_856::scoreOfParentheses(string s) {
    int level = 0;
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] == '(') level++;
        else level--;
        if (s[i] == ')' && s[i - 1] == '(') res += 1 << level;
    }
    return res;
}
