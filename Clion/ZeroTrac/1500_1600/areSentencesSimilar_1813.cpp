//
// Created by TzashiNorpu on 7/22/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

bool areSentencesSimilar_1813::areSentencesSimilar(string sentence1, string sentence2) {
  deque<string> a, b;
  string temp = "";
  for (int i = 0; i < sentence1.length(); ++i) {
    if (sentence1[i] == ' ') a.push_back(temp), temp = "";
    else temp += sentence1[i];
  }
  a.push_back(temp), temp = "";
  for (int i = 0; i < sentence2.length(); ++i) {
    if (sentence2[i] == ' ') b.push_back(temp), temp = "";
    else temp += sentence2[i];
  }
  b.push_back(temp), temp = "";
  while (a.size() && b.size() && (a.front() == b.front())) a.pop_front(), b.pop_front();
  while (a.size() && b.size() && (a.back() == b.back())) a.pop_back(), b.pop_back();
  if (!a.size() || !b.size()) return true;
  return false;
}
