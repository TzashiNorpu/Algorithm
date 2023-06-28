//
// Created by TzashiNorpu on 2023/6/28.
//
#include "../header/header.h"

using namespace zero;

int Solution::maxArea(int h, int w, vector<int> &horizontalCuts, vector<int> &verticalCuts) {
  //
  vector<int> heights, widths;

  int hCuts = horizontalCuts.size();
  std::sort(horizontalCuts.begin(), horizontalCuts.end());
  heights.push_back(horizontalCuts[0]);
  for (int i = 1; i < hCuts; ++i) {
    heights.push_back(horizontalCuts[i] - horizontalCuts[i - 1]);
  }
  heights.push_back(h - horizontalCuts[hCuts - 1]);
  int maxHeight = *std::max_element(heights.begin(), heights.end());

  int vCuts = verticalCuts.size();
  std::sort(verticalCuts.begin(), verticalCuts.end());
  widths.push_back(verticalCuts[0]);
  for (int i = 1; i < vCuts; ++i) {
    widths.push_back(verticalCuts[i] - verticalCuts[i - 1]);
  }
  widths.push_back(w - verticalCuts[vCuts - 1]);
  int maxWidth = *std::max_element(widths.begin(), widths.end());

  int MOD = 1000000007;
  return ((long long) maxHeight * maxWidth) % MOD;
}