//
// Created by TzashiNorpu on 2023/6/21.
//
#include "../header/header.h"

using namespace zero;

bool Solution::isRectangleOverlap(vector<int> &rec1, vector<int> &rec2) {
  // [x11, y11, x12, y12]  [x21, y21, x22, y22]
  // x11 < x22 && y11 < y22 &&  x12 >= x21 && y12 >= y21
  return rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3];
}