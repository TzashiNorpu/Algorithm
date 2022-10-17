//
// Created by TzashiNorpu on 10/14/2022.
//
#include "disjoint_set.h"

using namespace DS;

bool Solution::equationsPossible(vector<string> &equations) {
  UF uf = *new UF(26);
  for (auto eq: equations) {
    if (eq[1] == '=') {
      char x = eq[0];
      char y = eq[3];
      uf.connect(x - 'a', y - 'a');
    }
  }
  for (auto eq: equations) {
    if (eq[1] == '!') {
      char x = eq[0];
      char y = eq[3];
      if (uf.connected(x - 'a', y - 'a'))
        return false;
    }
  }
  return true;
}