//
// Created by TzashiNorpu on 2023/6/8.
//
#include "../header/header.h"

using namespace zero;

int Solution::findTheWinner(int n, int k) {
  deque<int> que;
  for (int i = 1; i <= n; ++i) {
    que.push_back(i);
  }
  while (que.size() != 1) {
    int x = k;
    while (x-- > 1) {
      int tmp = que[0];
      //printf("x=%d,tmp=%d\n",x,tmp);
      que.pop_front();
      que.push_back(tmp);
    }
    que.pop_front();
  }
  return que[0];
}