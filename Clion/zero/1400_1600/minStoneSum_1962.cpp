//
// Created by tseringnorpu on 6/11/2023.
//
#include "../header/header.h"
using namespace zero;

int Solution::minStoneSum(vector<int> &piles, int k) {
    int res=0;
    // 升序
    struct compare {
        bool operator()( int a,  int b) {
            return a<b;
        }
    };
    // 大顶堆
    priority_queue<int,vector<int>,compare> pq;
    for (auto x: piles) {
        pq.push(x);
    }
    int temp=k;
    while (temp-->0){
        int m = pq.top();
        pq.pop();
        int d = m / 2 + m % 2;
        //printf("m=%d\n，m=%d\n",m,d);
        pq.push(d);
    }
    while (!pq.empty()) {
        res += pq.top();
        pq.pop();
    }
    return res;
}