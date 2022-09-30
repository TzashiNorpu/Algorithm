//
// Created by TzashiNorpu on 9/30/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::carFleet(int target, vector<int> &position, vector<int> &speed) {
  map<int, double> m;
  for (int i = 0; i < position.size(); i++) m[-position[i]] = (double) (target - position[i]) / speed[i];
  int res = 0;
  double cur = 0;
  // map 里面离开始最近的开始
  for (auto &it: m)
    if (it.second > cur) cur = it.second, res++;
  return res;
}