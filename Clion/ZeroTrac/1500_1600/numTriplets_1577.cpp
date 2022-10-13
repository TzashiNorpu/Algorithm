//
// Created by TzashiNorpu on 7/25/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int numTriplets_1577::numTriplets(vector<int> &nums1, vector<int> &nums2) {
  unordered_map<long, int> sqr_a, sqr_b;
  int res = 0;
  for (int x: nums1) sqr_a[1L * x * x]++;
  for (int x: nums2) sqr_b[1L * x * x]++;
  for (int i = 0; i < nums2.size(); i++) {
    for (int j = i + 1; j < nums2.size(); ++j) {
      long v = 1L * nums2[i] * nums2[j];
      if (sqr_a.count(v)) res += sqr_a[v];
    }
  }
  for (int i = 0; i < nums1.size(); i++) {
    for (int j = i + 1; j < nums1.size(); ++j) {
      long v = 1L * nums1[i] * nums1[j];
      if (sqr_b.count(v)) res += sqr_b[v];
    }
  }
  return res;
}