//
// Created by TzashiNorpu on 10/14/2022.
//

#include "../header/disjoint_set.h"

using namespace DS;

bool Solution::equationsPossible(vector<string> &equations) {
  UF uf = *new UF(26);
  for (auto &s: equations)
    if (s[1] == '=')
      uf.connect(s[0] - 'a', s[3] - 'a');
  for (auto &s: equations)
    if (s[1] == '!')
      if (uf.connected(s[0] - 'a', s[3] - 'a'))
        return false;
  return true;
}