//
// Created by TzashiNorpu on 7/13/2022.
//

#include "../header/1500_1600.h"

using namespace ZeroTrac;

string removeDuplicates_1047::removeDuplicatesBy2Pointers(string s) {
  int i = 0;
  for (int j = 0; j < s.length(); j++, i++) {
    s[i] = s[j];
    if (i > 0 && s[i - 1] == s[i]) i -= 2;
  }
  return s.substr(0, i);
}

string removeDuplicates_1047::removeDuplicatesByStack(string s) {
  string res = "";
  for (char &c: s) {
    if (res.size() && res.back() == c) { res.pop_back(); }
    else { res.push_back(c); }
  }
  return res;
}
