//
// Created by tseringnorpu on 6/4/2023.
//
#include "../header/header.h"

using namespace zero;

int Solution::maximum69Number(int num) {
    string s = to_string(num);
    for (auto &c: s) {
        if (c=='6') {
            c = '9';
            break;
        }
    }
    return atoi(s.c_str());
}