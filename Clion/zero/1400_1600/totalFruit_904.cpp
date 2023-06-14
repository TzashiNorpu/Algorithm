//
// Created by tseringnorpu on 6/14/2023.
//
#include "../header/header.h"
using namespace zero;

int Solution::totalFruit(vector<int> &fruits) {
    // 1,2,3,2,2
    // 1,1,1,2,3,2
    // Find out the longest length of subarrays with at most 2 different numbers
    unordered_map<int,int>count;
    int i=0,j=0;
    int n = fruits.size();
    for (; j < n; j++) {
        count[fruits[j]]++;
        if (count.size() > 2) {
            if (--count[fruits[i]]==0) count.erase(fruits[i]);
            i++;
        }
    }
    return j-i;
}