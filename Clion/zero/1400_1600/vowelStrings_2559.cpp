
//
// Created by TzashiNorpu on 2023/6/20.
//
#include "../header/header.h"

using namespace zero;

vector<int> Solution::vowelStrings(vector <string> &words, vector <vector<int>> &queries) {
  int n = words.size();
  unordered_set<char> st{'a', 'o', 'e', 'i', 'u'};
  vector<int> count(n + 1, 0);
  for (int i = 0; i < n; ++i) {
    string w = words[i];
    if (st.count(w[0]) && st.count(w[w.size() - 1])) count[i + 1] = count[i] + 1;
    else count[i + 1] = count[i];
  }
  vector<int> res;
  for (auto &x: queries)
    res.push_back(count[x[1] + 1] - count[x[0]]);
  return res;
}