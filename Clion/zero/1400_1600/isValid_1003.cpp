//
// Created by tseringnorpu on 6/15/2023.
//
#include "../header/header.h"
using namespace zero;

bool Solution::isValid(string s) {
    int pos = s.find("abc");
    while (pos != s.npos) {
        s.erase(pos,3);
        pos = s.find("abc");
    }
    return s.size()==0;
}