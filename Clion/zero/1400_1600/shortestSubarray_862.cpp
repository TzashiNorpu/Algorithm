//
// Created by tseringnorpu on 6/14/2023.
//
#include "../header/header.h"

using namespace zero;

int Solution::shortestSubarray(vector<int> &nums, int k) {
  /*
   * [84,-1,-37,32,40,96] -> preSum:[0,84,83,46,78,118,214] k=167  最短:[]
   * deq :[0,84] -> 此时到83，83入栈前把84先弹出来，后续和84都满足的话，和83可定也满足，且更短
   */
  int n = nums.size();
  vector<long long> preSum(n + 1, 0);
  for (int i = 0; i < n; ++i) {
    preSum[i + 1] = preSum[i] + nums[i];
  }
  int res = n + 1;
  deque<int> dq;
  for (int i = 0; i <= n; ++i) {
    long long cur = preSum[i];
    while (!dq.empty() && cur - preSum[dq.front()] >= k) {
      res = min(res, i - dq.front());
      dq.pop_front();
    }
    while (!dq.empty() && cur <= preSum[dq.back()]) {
      dq.pop_back();
    }
    dq.push_back(i);
  }
  return res == n + 1 ? -1 : res;
}