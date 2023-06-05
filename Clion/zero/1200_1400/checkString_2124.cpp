//
// Created by tseringnorpu on 6/5/2023.
//
#include "../header/header.h"
using namespace zero;

bool Solution::checkString(string s) {
    bool b_exist= false;
    for (auto c:s) {
        if (c=='a' && b_exist) return false;
        if (c=='b') b_exist= true;
    }
    return true;

//    return is_sorted(s.begin(),s.end());
}