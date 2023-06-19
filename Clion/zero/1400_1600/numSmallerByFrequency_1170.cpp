//
// Created by TzashiNorpu on 2023/6/19.
//
#include "../header/header.h"

using namespace zero;

vector<int> Solution::numSmallerByFrequency(vector <string> &queries, vector <string> &words) {
  auto getFre = [](string s) -> int {
      vector<int> count(26, -1);
      int n = s.size();
      for (int i = 0; i < n; ++i) {
        count[s[i] - 'a']++;
      }
      for (int i = 0; i < 26; ++i) {
        if (count[i] != -1) return count[i] + 1;
      }
      return -1;
  };
  int n = words.size();
  vector<int> count(n, 0);
  for (int i = 0; i < n; ++i) {
    count[i] = getFre(words[i]);
  }
  std::sort(count.begin(), count.end());
  int len = queries.size();
  vector<int> res(len);
  for (int i = 0; i < len; ++i) {
    auto index = getFre(queries[i]);
    int cnt = 0;
    for (int j = 0; j < n; ++j) {
      if (index < count[j]) cnt++;
    }
    res[i] = cnt;
  }
  return res;
}