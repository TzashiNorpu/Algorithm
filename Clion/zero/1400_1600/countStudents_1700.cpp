//
// Created by TzashiNorpu on 2023/6/6.
//
#include "../header/header.h"

using namespace zero;

int Solution::countStudents(vector<int> &students, vector<int> &sandwiches) {
  int count[] = {0, 0};
  int n = students.size(), k = 0;
  for (auto stu: students) count[stu]++;
  for (; k < n && count[sandwiches[k]] > 0; ++k) count[sandwiches[k]]--;
  return n - k;
}