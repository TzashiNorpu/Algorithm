//
// Created by TzashiNorpu on 7/14/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

vector<int> findOriginalArray_2007::findOriginalArray(vector<int> &changed) {
  vector<int> res;
  std::sort(changed.begin(), changed.end());
  unordered_map<int, int> map;
  for (int num: changed) {
    map[num]++;
    if (num < 0 && num % 2 == 0 && map[num * 2] != 0) {
      map[num]--;
      map[num * 2]--;
      res.push_back(num);
    }
    if (num > 0 && num % 2 == 0 && map[num / 2] != 0) {
      map[num]--;
      map[num / 2]--;
      res.push_back(num / 2);
    }
  }
  if (map[0] != 0 && map[0] % 2 != 0) return {};
  while (map[0] != 0 && map[0] % 2 == 0) {
    res.push_back(0);
    map[0] -= 2;
  }
  for (auto kv: map) {
    if (kv.second != 0) return {};
  }
  return res;
}
