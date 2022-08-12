//
// Created by TzashiNorpu on 8/12/2022.
//
#include "header.h"

using namespace ZeroTrac;

long long Solution::minimumTime(vector<int> &time, int totalTrips) {
  /*std::sort(time.begin(), time.end());
  int n = time.size();
  long long l = time[0], r = (long long) totalTrips * time[0];
  while (l <= r) {
    long long mid = l + (r - l) / 2;
    long long trip = 0;
    int index = 0;
    while (index < n && mid / time[index]) {
      trip += (mid / time[index++]);
    }
    //printf("mid=%d,trip=%d",mid,trip);
    if (trip >= totalTrips) r = mid - 1;
    else l = mid + 1;
  }
  return l;*/


  long long l = 0, r = LLONG_MAX / time.size();
  while (l < r) {
    long long m = (l + r) / 2, trips = 0;
    for (int t: time)
      trips += m / t;
    if (trips < totalTrips)
      l = m + 1;
    else
      r = m;
  }
  return l;
}