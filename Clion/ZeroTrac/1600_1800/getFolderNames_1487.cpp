//
// Created by TzashiNorpu on 9/26/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

vector<string> Solution::getFolderNames(vector<string> &names) {
  int n = names.size();
  unordered_map<string, int> map;
  for (int i = 0; i < n; i++) {
    if (map.find(names[i]) != map.end()) {
      int k = map[names[i]];
      while (map.find(names[i] + "(" + to_string(k) + ")") != map.end()) {
        k++;
        map[names[i]]++;
      }
      map[names[i]]++;
      names[i] = names[i] + "(" + to_string(k) + ")";
    }
    map[names[i]] = 1;
  }
  return names;
}