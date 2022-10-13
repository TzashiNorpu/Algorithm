//
// Created by TzashiNorpu on 7/22/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

bool canChoose_1764::canChoose(vector<vector<int>> &groups, vector<int> &nums) {
  int numsIndex = 0, groupsIndex = 0;
  while (numsIndex < nums.size() && groupsIndex < groups.size()) {
    int matchCount = 0;
    while (numsIndex + matchCount < nums.size() &&
           matchCount < groups[groupsIndex].size() &&
           nums[numsIndex + matchCount] == groups[groupsIndex][matchCount])
      matchCount++;
    if (matchCount == groups[groupsIndex].size()) groupsIndex++, numsIndex += matchCount;
    else numsIndex++;
  }
  return groupsIndex == groups.size();
}
