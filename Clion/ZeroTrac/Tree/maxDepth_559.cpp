//
// Created by TzashiNorpu on 11/3/2022.
//
#include "tree.h"

using namespace Tree;


int Solution::maxDepth(NthNode *root) {
  int res = 0;
  if (!root) return res;
  deque<NthNode *> dq;
  dq.push_back(root);
  while (!dq.empty()) {
    int size = dq.size();
    for (int i = 0; i < size; ++i) {
      NthNode *pop = dq.front();
      dq.pop_front();
      for (auto &j: pop->children) {
        dq.push_back(j);
      }
    }
    res++;
  }
  return res;
}