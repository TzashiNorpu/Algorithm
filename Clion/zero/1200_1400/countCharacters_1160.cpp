//
// Created by TzashiNorpu on 2023/6/6.
//
#include "../header/header.h"

using namespace zero;

int Solution::countCharacters(vector <string> &words, string chars) {
  vector<int> char_count(26, 0);
  int res = 0;
  for (char c: chars) {
    char_count[c - 'a']++;
  }
  for (string word: words) {
    vector<int> word_count(26, 0);
    bool flag = false;
    for (char c: word) {
      word_count[c - 'a']++;
    }
    for (int i = 0; i < 26; ++i) {
      if (word_count[i] > char_count[i]) {
        flag = true;
        break;
      }
    }
    if (!flag)
      res += word.size();
  }
  return res;
}