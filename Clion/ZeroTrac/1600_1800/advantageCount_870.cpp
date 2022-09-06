//
// Created by TzashiNorpu on 8/15/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<int> Solution::advantageCount(vector<int> &nums1, vector<int> &nums2) {
  /*
   * For each B[i], we select the smallest number in A that is
   * greater than B[i]. If there are no such number,
   * we select the smalest number in A.
   */
  multiset<int> s(begin(nums1), end(nums1));
  for (auto i = 0; i < nums2.size(); ++i) {
    auto p = *s.rbegin() <= nums2[i] ? s.begin() : s.upper_bound(nums2[i]);
    nums1[i] = *p;
    s.erase(p);
  }
  return nums1;
}