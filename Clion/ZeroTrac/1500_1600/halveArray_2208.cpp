//
// Created by TzashiNorpu on 7/14/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int halveArray_2208::halveArray(vector<int> &nums) {
  /*long sum = 0;
  priority_queue<double> queue;
  for (int num: nums) {
      queue.push(num);
      sum += num;
  }*/
  double sum = accumulate(begin(nums), end(nums), j0(0));
  priority_queue<double> queue;
  double sum_bak = sum;
  int res = 0;
  while (sum_bak > sum / 2.0) {
    double t = queue.top() / 2.0;
    queue.pop();
    sum_bak -= t;
    queue.push(t);
    res++;
  }
  return res;
}
