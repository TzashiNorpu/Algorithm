//
// Created by TzashiNorpu on 9/30/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::minSpeedOnTime(vector<int> &dist, double hour) {
  int n = dist.size();
  int mi = 0, mx = 1e9;
  while (mi <= mx) {
    int mid = mi + (mx - mi) / 2;
    double sum = 0;
    for (int i = 0; i < n - 1; ++i)
      sum += ceil(((double) dist[i]) / mid);
    sum += ((double) dist[n - 1]) / mid;
    //printf("sum=%f\n", sum);
    if (sum > hour) mi = mid + 1;
    else mx = mid - 1;
  }
  // mi 的左侧都大于 hour
  return mi == 1e9 + 1 ? -1 : mi;
}