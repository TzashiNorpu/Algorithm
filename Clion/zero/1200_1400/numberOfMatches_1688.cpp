//
// Created by tseringnorpu on 6/5/2023.
//

#include "../header/header.h"

using namespace zero;

int Solution::numberOfMatches(int n) {
    int ans=0;
    while (n > 1) {
        ans+=n/2;
        n = (n+1)/2;
    }
    return ans;
}