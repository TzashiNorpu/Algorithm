//
// Created by TzashiNorpu on 9/26/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

/*bool request(int a, int b) {
  return !(b <= 0.5 * a + 7 || b > a || (b > 100 && a < 100));
}*/

int Solution::numFriendRequests(vector<int> &ages) {
  unordered_map<int, int> count;
  function<bool(int, int)> request = [&](int a, int b) -> bool {
      return !(b <= 0.5 * a + 7 || b > a || (b > 100 && a < 100));
  };
  for (int &age: ages) count[age]++;
  int res = 0;
  for (auto &a: count)
    for (auto &b: count)
      if (request(a.first, b.first))
        res += a.second * (b.second - (a.first == b.first ? 1 : 0));
  return res;
}

