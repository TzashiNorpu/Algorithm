//
// Created by TzashiNorpu on 8/11/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

bool Solution::equationsPossible(vector<string> &equations) {
  function<int(vector<int> &, int)> uf_find = [&](vector<int> &uf, int a) -> int {
      return uf[a] == -1 || uf[a] == a ? a : uf_find(uf, uf[a]);
  };
  vector<int> uf('z' + 1, -1);
  for (auto s: equations)
    if (s[1] == '=') uf[uf_find(uf, s[0])] = uf_find(uf, s[3]);
  for (auto s: equations)
    if (s[1] == '!' && uf_find(uf, s[0]) == uf_find(uf, s[3])) return false;
  return true;
}