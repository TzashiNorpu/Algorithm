//
// Created by TzashiNorpu on 9/7/2022.
//
#include "header.h"

using namespace ZeroTrac;

string Solution::minRemoveToMakeValid(string s) {
  stack<int> st;
  for (int i = 0; i < s.size(); i++) {
    if (s[i] == '(') st.push(i);
    if (s[i] == ')')
      if (st.empty()) s[i] = '*';
      else st.pop();
  }
  while (!st.empty()) {
    s[st.top()] = '*';
    st.pop();
  }
  // remove 只删除，但是仍然占位
  // erase
  s.erase(remove(s.begin(), s.end(), '*'), s.end());
  return s;
}