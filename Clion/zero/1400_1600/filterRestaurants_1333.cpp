//
// Created by TzashiNorpu on 2023/6/15.
//
#include "../header/header.h"

using namespace zero;

vector<int>
Solution::filterRestaurants(vector <vector<int>> &restaurants, int veganFriendly, int maxPrice, int maxDistance) {
  vector <vector<int>> tmp;
  for (auto &x: restaurants) {
    if ((x[2] == veganFriendly || x[2]) && x[3] <= maxPrice && x[4] <= maxDistance) tmp.push_back(x);
  }
  sort(tmp.begin(), tmp.end(), [](auto &a, auto &b) { /*return a[1] == b[1] ? a[0] > b[0] : a[1] > b[1]; */
      if (a[1] == b[1]) return a[0] > b[0];
      return a[1] > b[1];
  });
  vector<int> res;
  for (auto &x: tmp) res.push_back(x[0]);
  return res;
}