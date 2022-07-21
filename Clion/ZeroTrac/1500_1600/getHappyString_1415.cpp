//
// Created by TzashiNorpu on 7/21/2022.
//
#include "header.h"

using namespace ZeroTrac;
int myCount = 0;
string res = "";

void helper(int n, int k, int prev, string s) {
    if (s.length() == n) {
        myCount++;
        if (myCount == k) res = s;
        return;
    }
    for (int i = 0; i < 3; ++i) {
        if (i != prev) {
            s.push_back(char('a' + i));
            helper(n, k, i, s);
            s.pop_back();
        }
    }
}

string getHappyString_1415::getHappyString(int n, int k) {
    helper(n, k, -1, "");
    return res;
}