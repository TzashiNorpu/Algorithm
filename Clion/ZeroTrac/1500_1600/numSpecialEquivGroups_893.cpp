//
// Created by TzashiNorpu on 7/22/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int numSpecialEquivGroups_893::numSpecialEquivGroups(vector<string> &words) {
  set<pair<string, string>> set;
  for (string w: words) {
    pair<string, string> s;
    for (int i = 0; i < w.size(); i++) {
      if (i % 2) s.first += w[i];
      else s.second += w[i];
    }
    sort(s.first.begin(), s.first.end());
    sort(s.second.begin(), s.second.end());
    set.insert(s);
  }
  return set.size();
}