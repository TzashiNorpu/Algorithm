//
// Created by TzashiNorpu on 7/13/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

string removeDuplicates_1209::removeDuplicatesBy2Pointers(string s, int k) {
  int i = 0, n = s.length();
  vector<int> count(n);
  for (int j = 0; j < n; j++, i++) {
    s[i] = s[j];
    count[i] = i > 0 && s[i - 1] == s[j] ? count[i - 1] + 1 : 1;
    if (count[i] == k) i -= k;
  }
  return s.substr(0, i);
}

string removeDuplicates_1209::removeDuplicatesByStack(string s, int k) {
  vector<pair<int, char>> stack = {{0, '#'}};
  for (char c: s) {
    if (stack.back().second != c) stack.push_back({1, c});
    else if (++stack.back().first == k) stack.pop_back();
  }
  string res;
  for (auto &p: stack) res.append(p.first, p.second);
  return res;
}