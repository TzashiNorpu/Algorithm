//
// Created by TzashiNorpu on 2023/6/2.
//
#include "../header/header.h"

using namespace zero;

string Solution::reversePrefix(string word, char ch) {
  /*int pos = word.find(ch);
  int l = 0, r = pos;
  while (l < r) {
    auto c = word[l];
    word[l] = word[r];
    word[r] = c;
    l++, r--;
  }
  return word;*/
  reverse(begin(word), begin(word) + word.find(ch) + 1);
  return word;
}