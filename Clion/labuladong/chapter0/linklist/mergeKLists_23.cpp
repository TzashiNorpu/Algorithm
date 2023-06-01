//
// Created by TzashiNorpu on 5/31/2023.
//
#include "../../header/header.h"

using namespace labuladong;

ListNode *Solution::mergeKLists(vector<ListNode *> &lists) {
  struct compare {
      bool operator()(const ListNode *l, const ListNode *r) {
        return l->val > r->val;
      }
  };
  priority_queue < ListNode * , vector < ListNode * >, compare > q;
  for (auto l: lists) {
    if (l)q.push(l);
  }
  auto dummy = new ListNode(-1);
  auto x = dummy;
  while (!q.empty()) {
    auto top = q.top();
    q.pop();
    x->next = top;
    if (top->next) q.push(top->next);
    x = x->next;
  }
  return dummy->next;
}