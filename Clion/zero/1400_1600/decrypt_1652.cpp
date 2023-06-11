//
// Created by tseringnorpu on 6/11/2023.
//
#include "../header/header.h"
using namespace zero;

vector<int> Solution::decrypt(vector<int> &code, int k) {
    int n = code.size();
    vector<int> res(n,0);
    if(k>0){
        for (int i = 0; i < n; ++i) {
            int sum=0;
            for (int j = 1; j <= k; ++j) {
                sum+=code[(i+j)%n];
            }
            res.push_back(sum);
        }
    }
    if(k<0){
        for (int i = 0; i < n; ++i) {
            int sum=0;
            for (int j = 1; j <= -k; ++j) {
                sum+=code[(i-k)%n];
            }
            res.push_back(sum);
        }
    }
    return res;
}