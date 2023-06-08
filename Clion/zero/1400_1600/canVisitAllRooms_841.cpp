//
// Created by TzashiNorpu on 2023/6/8.
//
#include "../header/header.h"

using namespace zero;

bool Solution::canVisitAllRooms(vector <vector<int>> &rooms) {
  int n = rooms.size();
  vector<bool> canVisit(n, false);

  function<void(int)> helper = [&](int index) -> void {
      if (index == n) return;
      if (canVisit[index]) return;
      canVisit[index] = true;
      for (auto room: rooms[index]) {
        helper(room);
      }
  };
  helper(0);
  return std::find(canVisit.begin(), canVisit.end(), false) == canVisit.end();
}