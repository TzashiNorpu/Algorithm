//
// Created by TzashiNorpu on 9/6/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<string>
Solution::watchedVideosByFriends(vector<vector<string>> &watchedVideos, vector<vector<int>> &friends, int id,
                                 int level) {
  unordered_set<int> visited = {id};
  vector<int> q1 = {id};
  vector<string> res;
  // BFS to find level-degree friends
  while (level--) {
    vector<int> q2;
    for (auto i: q1)
      for (auto f: friends[i])
        if (visited.insert(f).second)
          q2.push_back(f);
    swap(q1, q2);
  }
  // Count movies to determine frequency
  unordered_map<string, int> freq;
  for (auto i: q1)
    for (auto &v: watchedVideos[i])
      ++freq[v];
  // Sort the movies by the frequency
  set<pair<int, string>> s;
  for (auto &p: freq)
    s.insert({p.second, p.first});
  for (auto &p: s)
    res.push_back(p.second);
  return res;
}