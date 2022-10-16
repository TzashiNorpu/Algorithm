//
// Created by TzashiNorpu on 8/10/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

string Solution::rankTeams(vector<string> &votes) {
  vector<vector<int>> count(26, vector<int>(27));
  for (char &c: votes[0])
    count[c - 'A'][26] = c;
  for (string &vote: votes)
    for (int i = 0; i < vote.length(); ++i)
      --count[vote[i] - 'A'][i];
  std::sort(count.begin(), count.end());
  string s;
  for (int i = 0; i < votes[0].length(); ++i)
    s += count[i][26];
  return s;
}